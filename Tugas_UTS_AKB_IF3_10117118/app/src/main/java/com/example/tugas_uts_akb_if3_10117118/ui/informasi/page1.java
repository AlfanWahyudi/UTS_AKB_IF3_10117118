package com.example.tugas_uts_akb_if3_10117118.ui.informasi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uts_akb_if3_10117118.R;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/


/**
 * A simple {@link Fragment} subclass.
 */
public class page1 extends Fragment {
    private int page;

    public static page1 newInstance(int page) {
        page1 mPage1 = new page1();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        mPage1.setArguments(args);
        return mPage1;
    }
    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 /*       View view = inflater.inflate(R.layout.fragment_page1, container, false);
  */    ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.fragment_page1, container, false);
    }
}
