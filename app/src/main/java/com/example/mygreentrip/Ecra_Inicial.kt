package com.example.mygreentrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ecra_Inicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecra_inicial)

        val buttonClick = findViewById<Button>(R.id.comecar)

        buttonClick.setOnClickListener {
            val intent = Intent(this, Ecra_Inicial_Termos::class.java)
            startActivity(intent)
        }
    }
}