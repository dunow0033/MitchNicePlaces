package com.express.android.mitchjavamvvm.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.express.android.mitchjavamvvm.models.NicePlace;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<NicePlace>> mNicePlaces;

    public void init() {

    }

    public LiveData<List<NicePlace>> getNicePlaces() {
        return mNicePlaces;
    }
}
