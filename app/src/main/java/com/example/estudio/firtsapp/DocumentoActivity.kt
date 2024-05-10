package com.example.estudio.firtsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.estudio.R

class DocumentoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inflar el diseño de la actividad ResultActivity
        setContentView(R.layout.activity_documento)

        // Configurar los botones después de inflar el diseño

        val button2 = findViewById<Button>(R.id.button2)
        val imageDocum = findViewById<ImageView>(R.id.imageinicio)
        val textView7 = findViewById<TextView>(R.id.textView3)



        imageDocum.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

// Configurar OnClickListener para el TextView
        textView7.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }


        // Configurar el padding para manejar los bordes
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}