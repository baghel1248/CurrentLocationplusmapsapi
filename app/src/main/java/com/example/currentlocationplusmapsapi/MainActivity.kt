package com.example.currentlocationplusmapsapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.SupportMapFragment

class MainActivity : AppCompatActivity() {
    lateinit var supportMapFragment:SupportMapFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportMapFragment =
            (supportFragmentManager.findFragmentById(R.id.google_maps) as SupportMapFragment?)!!
    }
}