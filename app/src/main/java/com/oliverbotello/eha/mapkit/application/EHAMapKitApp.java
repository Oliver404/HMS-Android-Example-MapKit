package com.oliverbotello.eha.mapkit.application;

import android.app.Application;
import android.util.Log;

import com.huawei.hms.maps.MapsInitializer;
import com.oliverbotello.eha.mapkit.R;

public class EHAMapKitApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MapsInitializer.setApiKey(getString(R.string.api_key)); // Set API KEY for Maps
        MapsInitializer.initialize(this); // Initialize maps with application context
    }
}
