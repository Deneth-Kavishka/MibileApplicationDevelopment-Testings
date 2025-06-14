package com.example.twoactivityapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textView = findViewById<TextView>(R.id.textViewResult2)
        val name = intent.getStringExtra("user_name")
        textView.text = "Thank You, $name!"
    }
}
