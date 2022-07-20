package com.oliverbotello.eha.mapkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private HuaweiMap hMap;

    // Activity Methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMap(savedInstanceState);
    }

    // Class Methods
    private void initMap(Bundle savedInstanceState) {
        MapView mapView = (MapView) findViewById(R.id.mapview); // Get view from XML
        Bundle mapViewBundle = null; // Instance for MapBundle

        if (savedInstanceState != null) { // Validate if there is a saved instance
            mapViewBundle = savedInstanceState.getBundle("MapViewBundleKey"); // Get MapBundle Data
        }

        mapView.onCreate(mapViewBundle); // Set MapBundle to MapView
        mapView.getMapAsync(this); // Init Map
    }

    // OnMapReadyCallback Methods
    @Override
    public void onMapReady(HuaweiMap huaweiMap) {
        hMap = huaweiMap; // Set reference to Map
    }
}