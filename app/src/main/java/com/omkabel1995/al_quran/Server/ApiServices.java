package com.omkabel1995.al_quran.Server;
import com.omkabel1995.al_quran.Response.Response_Surat;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiServices {
    @GET("json/surat")
    Call<Response_Surat> getsurat();
}
