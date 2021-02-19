package com.omkabel1995.al_quran.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.omkabel1995.al_quran.Adapter.Adapter_Surat;
import com.omkabel1995.al_quran.Controller.Surat;
import com.omkabel1995.al_quran.Model.Model_Surat;
import com.omkabel1995.al_quran.R;
import com.omkabel1995.al_quran.View.MySurat;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Menu_Utama extends AppCompatActivity implements MySurat {
    ProgressDialog progressDialog;
    @BindView(R.id.list_surat)
    RecyclerView recyclerView;
    ProgressDialog loading;
    Surat surat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__utama);
        ButterKnife.bind(this);
        loading=new ProgressDialog(this);
        surat=new Surat(Menu_Utama.this);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager llm=new GridLayoutManager(Menu_Utama.this,1);
        recyclerView.setLayoutManager(llm);
        getSurat();
    }

    private void getSurat() {
        loading.setMessage("Loading............");
        loading.setCancelable(true);
        loading.show();
        surat.GetSurat();
    }
    @Override
    public void Berhasil(List<Model_Surat> surat) {
        loading.dismiss();
        Adapter_Surat adapter=new Adapter_Surat(Menu_Utama.this,surat);
        recyclerView.setAdapter(adapter);

    }
    @Override
    public void Gagal(String Message){
        loading.dismiss();
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

    }
    @Override
    public void NoInternet(String Message){
        loading.dismiss();
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

    }
}