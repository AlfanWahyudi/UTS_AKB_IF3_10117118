package com.example.tugas_uts_akb_if3_10117118.ui.notifications;

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

public class KontakFragment extends Fragment {

    private KontakViewModel mKontakViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mKontakViewModel =
                ViewModelProviders.of(this).get(KontakViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kontak, container, false);
        final TextView textView = root.findViewById(R.id.text_kontak);
        mKontakViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
