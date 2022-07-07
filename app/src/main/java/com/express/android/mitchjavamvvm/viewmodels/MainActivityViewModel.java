package com.express.android.mitchjavamvvm.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.express.android.mitchjavamvvm.models.NicePlace;

import java.util.List;

public class MainActivityViewModel {

    private MutableLiveData<List<NicePlace>> mNicePlaces;

    public LiveData<List<NicePlace>> getNicePlaces() {

    }
}
