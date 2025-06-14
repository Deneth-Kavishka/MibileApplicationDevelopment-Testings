package com.example.checkboxestest

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chkReading = findViewById<CheckBox>(R.id.chkReading)
        val chkTraveling = findViewById<CheckBox>(R.id.chkTravelling)
        val chkGaming = findViewById<CheckBox>(R.id.chkGaming)
        val chkCooking = findViewById<CheckBox>(R.id.chkCooking)
        val btnShowSelection = findViewById<Button>(R.id.btnShowSelection)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnShowSelection.setOnClickListener {
            val selectedHobbies = StringBuilder("Selected hobbies: \n")

            if (chkReading.isChecked) selectedHobbies.append("- Reading\n")
            if (chkTraveling.isChecked) selectedHobbies.append("- Travelling\n")
            if (chkGaming.isChecked) selectedHobbies.append("- Gaming\n")
            if (chkCooking.isChecked) selectedHobbies.append("- Cooking\n")

            if (selectedHobbies.toString() == "Selected hobbies: \n") {
                txtResult.text = "No hobbies selected."
            } else {
                txtResult.text = selectedHobbies.toString()
            }
        }
    }
}