package com.omkabel1995.al_quran.Controller;

import android.util.Log;

import com.omkabel1995.al_quran.Model.Model_Surat;
import com.omkabel1995.al_quran.Response.Response_Surat;
import com.omkabel1995.al_quran.Server.ApiServices;
import com.omkabel1995.al_quran.Server.InitRetrofit;
import com.omkabel1995.al_quran.View.MySurat;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Surat {
    final MySurat mySurat;

    public Surat(MySurat mySurat) {
        this.mySurat = mySurat;
    }
    public void GetSurat(){
        ApiServices api = InitRetrofit.getInstance().getApi();
        Call<Response_Surat> menuCall = api.getsurat();
        menuCall.enqueue(new Callback<Response_Surat>() {
            @Override
            public void onResponse(Call<Response_Surat> call, Response<Response_Surat> response) {
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    List<Model_Surat> surat= response.body().getHasil();
                    String status = response.body().getStatus();
                    if (status.equals("ok")){
                        try {
                           mySurat.Berhasil(surat);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else {
                        try {
                            String Message="Tidak Ada data";
                            mySurat.Gagal(Message);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            @Override
            public void onFailure(Call<Response_Surat> call, Throwable t) {
                try {
                    String Message="Server No Response";
                    mySurat.NoInternet(Message);
                    t.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }
}
