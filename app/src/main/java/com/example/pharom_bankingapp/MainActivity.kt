package com.example.pharom_bankingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_using_email)

        val register=findViewById<Button>(R.id.btnRegister)
        val loginUsingEmail=findViewById<Button>(R.id.btnLoginE)
        val loginUsingPhone=findViewById<Button>(R.id.btnLoginA)

        loginUsingPhone.setOnClickListener{
            val intent= Intent ( this, LoginUsingPhone::class.java)
            startActivity(intent)
        }

        loginUsingEmail.setOnClickListener{
            val intent= Intent ( this, Main::class.java)
            startActivity(intent)
        }

        register.setOnClickListener{
            val intent= Intent ( this, Register::class.java)
            startActivity(intent)
        }


    }
}