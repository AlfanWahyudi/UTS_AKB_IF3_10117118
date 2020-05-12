package com.example.tugas_uts_akb_if3_10117118.Presenter;

import android.view.View;

import com.example.tugas_uts_akb_if3_10117118.Data.Model.Profil;
import com.example.tugas_uts_akb_if3_10117118.ui.profil.IProfilView;
/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/

public class ProfilPresenter implements IProfilPresenter {

    private IProfilView mIProfilView;

    public ProfilPresenter(IProfilView IProfilView) {
       this.mIProfilView = IProfilView;
    }

    @Override
    public void getCurrentProfil(String nim,String nama,String kelas,String deskripsi) {
      /*  Profil profil = new Profil("10117118","Alfan Wahyudi","IF-3",
                        "Mahasiswa semester 6 jurusan Teknik Informatika di Universitas "+
                                "Komputer Indonesia Kota Bandung");

        profil.getNim();
        profil.getNama();
        profil.getKelas();
        profil.getDeskripsi();*/


     /*   profil.setNim("10117118");
        profil.setNama("Alfan Wahyudi");
        profil.setKelas("IF-3");
        profil.setDeskripsi("Mahasiswa semester 6 jurusan Teknik Informatika di Universitas " +
                "Komputer Indonesia Kota Bandung");*/
    }

    @Override
    public Profil getNIM(String NIM) {
        Profil profil = new Profil();
        profil.setNim("10117118");
        return profil;
    }

}
