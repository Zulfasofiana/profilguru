package com.example.profilgurusofi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button2)

        btn.setOnClickListener {

            val Intent = Intent( this, MainActivity3::class.java)
            startActivity(Intent)
        }
    }
}