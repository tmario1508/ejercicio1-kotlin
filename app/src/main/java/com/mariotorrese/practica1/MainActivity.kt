package com.mariotorrese.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private  lateinit var btnSumar:Button
    private lateinit var btnPlus:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSumar = findViewById(R.id.btnSum)
        btnPlus = findViewById(R.id.btnPlus)

        btnSumar.setOnClickListener {
            var intent = Intent(this, SumarActivity::class.java)
            startActivity(intent)
        }

        btnPlus.setOnClickListener {
            var intent = Intent(this, PlusOneActivity::class.java)
            startActivity(intent)
        }
    }

}