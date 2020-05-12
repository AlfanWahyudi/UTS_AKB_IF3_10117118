package com.example.tugas_uts_akb_if3_10117118.ui.kontak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.tugas_uts_akb_if3_10117118.R;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/



public class KontakFragment extends Fragment {

    //private KontakViewModel mKontakViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      /*  mKontakViewModel =
                ViewModelProviders.of(this).get(KontakViewModel.class);
      */  ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        View root = inflater.inflate(R.layout.fragment_kontak, container, false);
        return root;
    }
}
