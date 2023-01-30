package com.example.mygreentrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perfil_Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_main)

        val btnAlterar = findViewById<Button>(R.id.btnAlterar)
        btnAlterar.setOnClickListener({
            val nextPage = Intent(this,Perfil_Alterar_Main::class.java);
            startActivity(nextPage);
        })
    }
}