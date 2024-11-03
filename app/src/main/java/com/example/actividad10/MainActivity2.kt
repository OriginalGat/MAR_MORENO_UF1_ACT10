package com.example.actividad10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.annotation.SuppressLint

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editTextNombre = findViewById<EditText>(R.id.editTextText)
        val editTextApellido = findViewById<EditText>(R.id.editTextText2)
        val editNumberEdad = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTextUsuario = findViewById<EditText>(R.id.editTextText3)
        val passwordAuthentication = findViewById<EditText>(R.id.editTextTextPassword)

        val button = findViewById<Button>(R.id.button)



        button.setOnClickListener {

            if(editTextNombre.text.isNotBlank() && editTextApellido.text.isNotBlank() && editNumberEdad.text.isNotBlank() && editTextUsuario.text.isNotBlank() && passwordAuthentication.text.isNotBlank()) {

                Toast.makeText(this, "Registro Completo", Toast.LENGTH_SHORT).show()


            }else {

                Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_SHORT).show()
            }
        }

        val btn: Button = findViewById(R.id.button4)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button5)
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity3:: class.java)
            startActivity(intent)
        }
    }
}