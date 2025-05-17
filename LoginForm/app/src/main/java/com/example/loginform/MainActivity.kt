package com.example.loginform

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.editUsername)
        val password = findViewById<EditText>(R.id.editPassword)
        val loginbtn = findViewById<Button>(R.id.btnLogin)
        val resetbtn = findViewById<Button>(R.id.btnReset)



        loginbtn.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()
            if (user == "Alpha" && pass == "0225"){
            Toast.makeText(this,"Login Successful! You're Welcome $user.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }

        resetbtn.setOnClickListener {
            username.text.clear()
            password.text.clear()
            Toast.makeText(this, "Fields cleared", Toast.LENGTH_SHORT).show()
        }

    }
}