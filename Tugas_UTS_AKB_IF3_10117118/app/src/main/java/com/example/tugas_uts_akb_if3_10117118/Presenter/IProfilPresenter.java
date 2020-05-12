package com.example.tugas_uts_akb_if3_10117118.Presenter;

import android.view.View;

import com.example.tugas_uts_akb_if3_10117118.Data.Model.Profil;
import com.example.tugas_uts_akb_if3_10117118.ui.profil.IProfilView;
/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/
public interface IProfilPresenter {


    void getCurrentProfil(String nim,String nama,String kelas,String deskripsi);

    Profil getNIM(String NIM);
}
