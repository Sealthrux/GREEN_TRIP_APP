package com.example.mygreentrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Ecra_Inicial_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecra_inicial_login)

        val tv = findViewById<View>(R.id.explorar) as TextView

        tv.setOnClickListener{
            val intent = Intent(this, Ecra_Principal_SemLogin::class.java)
            startActivity(intent)
        }


    }
}