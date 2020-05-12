package com.example.tugas_uts_akb_if3_10117118.Data.Model;

public class Profil {
    private String nim, nama, kelas, deskripsi;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

//    public Profil(String nim, String nama, String kelas, String deskripsi) {
//        this.nim = nim;
//        this.nama = nama;
//        this.kelas = kelas;
//        this.deskripsi = deskripsi;
//    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
