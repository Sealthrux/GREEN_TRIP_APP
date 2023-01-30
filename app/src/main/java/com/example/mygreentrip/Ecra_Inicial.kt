package com.example.mygreentrip

import Database
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Ecra_Inicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecra_inicial)

        val db = Database()

        val buttonClick = findViewById<Button>(R.id.login)

        buttonClick.setOnClickListener {
            val intent = Intent(this, Ecra_Inicial_Termos::class.java)
            startActivity(intent)
        }
    }
}