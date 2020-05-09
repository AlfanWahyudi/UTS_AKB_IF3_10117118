package com.example.tugas_uts_akb_if3_10117118.ui.informasi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.tugas_uts_akb_if3_10117118.R;

public class InformasiFragment extends Fragment {


    private InformasiViewModel mInformasiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mInformasiViewModel =
                ViewModelProviders.of(this).get(InformasiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_informasi, container, false);
        final TextView textView = root.findViewById(R.id.txtInformasi);
        mInformasiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
