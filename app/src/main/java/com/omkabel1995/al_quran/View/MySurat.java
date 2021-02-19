package com.omkabel1995.al_quran.View;

import com.omkabel1995.al_quran.Model.Model_Surat;

import java.util.List;

public interface MySurat {
    void Berhasil(List<Model_Surat> surat);

    void Gagal(String Message);

    void NoInternet(String Message);
}
