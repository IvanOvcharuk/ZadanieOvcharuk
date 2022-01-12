package com.example.zadanieovcharuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var liczba = 1
        findViewById<Button>(R.id.button).setOnClickListener {
            if(liczba == 1)
                liczba = 4
            else if(liczba)
        }
    }
}