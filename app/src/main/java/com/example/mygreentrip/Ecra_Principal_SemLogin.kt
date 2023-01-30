package com.example.mygreentrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ecra_Principal_SemLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecra_principal_sem_login)

        val buttonClick = findViewById<Button>(R.id.ok1)

        buttonClick.setOnClickListener {
            val intent = Intent(this, Ecra_Principal_SemLoginN::class.java)
            startActivity(intent)
        }
    }
}