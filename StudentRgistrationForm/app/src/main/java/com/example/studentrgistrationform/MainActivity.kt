package com.example.studentrgistrationform

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editName = findViewById<EditText>(R.id.editName)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val contact = findViewById<EditText>(R.id.contact)
        val editDOB = findViewById<EditText>(R.id.editDOB)
        val gender = findViewById<RadioGroup>(R.id.gender)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnReset = findViewById<Button>(R.id.btnReset)

        // Submit click listener
        btnSubmit.setOnClickListener {
            val selectedGenderId = gender.checkedRadioButtonId
            val genderr = findViewById<RadioButton>(selectedGenderId)?.text ?: "Not Selected"

            val message = """
                Name: ${editName.text}
                Email: ${editEmail.text}
                Phone: ${contact.text}
                DOB: ${editDOB.text}
                Gender: $genderr
            """.trimIndent()

            //Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            // Use AlertDialog for full message
            androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Submission Successful")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show()


        }

        // Reset click listener
        btnReset.setOnClickListener {
            editName.text.clear()
            editEmail.text.clear()
            contact.text.clear()
            editDOB.text.clear()
            gender.clearCheck()

            Toast.makeText(this, "Form Reset", Toast.LENGTH_SHORT).show()
        }
    }
}