package com.example.pharom_bankingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LoginUsingPhone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_using_phone)

        val loginUsingEmail=findViewById<Button>(R.id.btnLoginA)
        val loginUsingPhone=findViewById<Button>(R.id.btnLoginE)
        val register=findViewById<Button>(R.id.btnRegister)

        loginUsingPhone.setOnClickListener{
            val intent = Intent ( this, Main::class.java)
            startActivity(intent)
        }

        loginUsingEmail.setOnClickListener{
            val intent= Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }

        register.setOnClickListener{
            val intent= Intent ( this, Register::class.java)
            startActivity(intent)
        }

    }
}