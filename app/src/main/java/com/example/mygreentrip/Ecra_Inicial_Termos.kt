package com.example.mygreentrip

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ecra_Inicial_Termos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecra_inicial_termos)

        val buttonClick = findViewById<Button>(R.id.termosaceito)

        buttonClick.setOnClickListener {
            val intent = Intent(this, Ecra_Inicial_Login::class.java)
            startActivity(intent)
        }
    }
}