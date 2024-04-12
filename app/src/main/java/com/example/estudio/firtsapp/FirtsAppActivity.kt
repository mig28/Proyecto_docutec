package com.example.estudio.firtsapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.estudio.R


class FirtsAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firts_app)  // Mueve esta línea al principio

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val  etUsername = findViewById<EditText>(R.id.etUsername)

        btnStart.setOnClickListener {
            val username = etUsername.text.toString() // Obtener el nombre de usuario ingresado
            val password = etName.text.toString() // Obtener la contraseña ingresada

            if (username.isNotEmpty() && password.isNotEmpty()) { // Verificar si ambos campos no están vacíos
                // Si ambos campos no están vacíos, iniciar la actividad ResultActivity
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
        }

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


}