package com.example.pharom_bankingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val register=findViewById<Button>(R.id.btnRegister)
        val loginUsingEmail=findViewById<Button>(R.id.btnLogin)

        loginUsingEmail.setOnClickListener{
            val intent= Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }

        register.setOnClickListener{
            val intent= Intent ( this, Main::class.java)
            startActivity(intent)
        }

    }
}