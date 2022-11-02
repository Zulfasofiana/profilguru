package com.example.profilgurusofi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btn = findViewById<TextView>(R.id.ok)
        val btn2 = findViewById<ImageView>(R.id.potensi)

        btn.setOnClickListener {

            val Intent = Intent( this, MainActivity2::class.java)
            startActivity(Intent)

        }
        btn2.setOnClickListener {

            val Intent = Intent( this, MainActivity4::class.java)
            startActivity(Intent)
        }

    }
}