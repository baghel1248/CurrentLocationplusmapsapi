package com.example.currentlocationplusmapsapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.SupportMapFragment

public class MainActivity extends AppCompatActivity {
        SupportMapFragment supportMapFragment;
        protected void   onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        supportMapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.google_maps);
        }
        }