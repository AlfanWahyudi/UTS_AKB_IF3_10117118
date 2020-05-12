package com.example.tugas_uts_akb_if3_10117118.ui.profil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugas_uts_akb_if3_10117118.Data.Model.Profil;
import com.example.tugas_uts_akb_if3_10117118.Presenter.ProfilPresenter;
import com.example.tugas_uts_akb_if3_10117118.R;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/


public class ProfilFragment extends Fragment implements IProfilView{

   // private ProfilViewModel mProfilViewModel;
    private Button mButton;
    private ProfilPresenter mProfilPresenter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profil, container, false);
        mProfilPresenter = new ProfilPresenter(this);
        TextView NIM = root.findViewById(R.id.txtNIM);
        TextView nama = root.findViewById(R.id.txtNama);
        TextView kelas = root.findViewById(R.id.txtKelas);
        TextView deskripsi = root.findViewById(R.id.txtDeskripsi);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        /*mProfilPresenter.getCurrentProfil(NIM.getText().toString(), nama.getText().toString(),
                                   kelas.getText().toString(), deskripsi.getText().toString());
        */


      return root;
       /* View root =
        mProfilPresenter = new ProfilPresenter(this);
        TextView NIM = root.findViewById(R.id.txtNIM);*/


       /* final TextView textView = root.findViewById(R.id.text_profil);
        mProfilViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
       */
    }


    @Override
    public Profil getProfil() {
        return null;
    }
}

