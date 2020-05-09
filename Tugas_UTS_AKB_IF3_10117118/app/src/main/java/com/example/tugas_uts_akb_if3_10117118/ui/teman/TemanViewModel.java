package com.example.tugas_uts_akb_if3_10117118.ui.teman;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TemanViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public TemanViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is teman fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
