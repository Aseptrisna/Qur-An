package com.omkabel1995.al_quran.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.omkabel1995.al_quran.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Menu_SplashCreen extends AppCompatActivity {
    @BindView(R.id.Judul)
    TextView judul;
    @BindView(R.id.slogan)
    TextView Slogan;
    @BindView(R.id.GambarApk)
    ImageView Icon;
    Animation uptodown, downtoup,Fadein,FadeOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__splash_creen);
        ButterKnife.bind(Menu_SplashCreen.this);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        Fadein = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        FadeOut= AnimationUtils.loadAnimation(this, R.anim.fade_out);
        Icon.setAnimation(uptodown);
        Slogan.setAnimation(downtoup);
        judul.setAnimation(downtoup);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Goto_MenuUtama();
            }
        }, 3000);

    }

    private void Goto_MenuUtama() {
        Intent intent=new Intent(Menu_SplashCreen.this,Menu_Utama.class);
        startActivity(intent);
        finish();
    }
}