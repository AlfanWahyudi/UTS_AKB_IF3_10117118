package com.example.tugas_uts_akb_if3_10117118.ui.informasi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformasiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InformasiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}