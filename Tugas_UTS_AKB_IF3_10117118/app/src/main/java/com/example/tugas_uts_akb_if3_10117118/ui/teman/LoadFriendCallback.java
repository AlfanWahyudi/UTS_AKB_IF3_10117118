package com.example.tugas_uts_akb_if3_10117118.ui.teman;

import com.example.tugas_uts_akb_if3_10117118.Data.Model.friend;

import java.util.ArrayList;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/


public interface LoadFriendCallback {
    void preExecute();
    void postExecute(ArrayList<friend> notes);
}
