package com.example.mygreentrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tv = findViewById<View>(R.id.l_perdeupass) as TextView

        tv.setOnClickListener{
            val intent = Intent(this, Recuperar_pass_email::class.java)
            startActivity(intent)
        }
    }
}