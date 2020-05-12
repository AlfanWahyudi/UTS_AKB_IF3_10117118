package com.example.tugas_uts_akb_if3_10117118.ui.informasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tugas_uts_akb_if3_10117118.R;

/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/

public class informasi extends AppCompatActivity {

    private ViewPager mViewPager;
    private ViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);
        mViewPager = findViewById(R.id.viewpager);
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);

    }
}
