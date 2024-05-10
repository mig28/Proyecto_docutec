package com.example.estudio.firtsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.estudio.R

class CompraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_compra)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtener una referencia al botón desde el layout
        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        val btnAnterior = findViewById<Button>(R.id.btnAnterior)

        // Configurar el OnClickListener para el botón
        btnSiguiente.setOnClickListener {
            // Crear y mostrar la alerta
            mostrarAlerta()
        }
        btnAnterior.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }

    private fun mostrarAlerta() {
        // Crear una instancia de AlertDialog.Builder
        val builder = AlertDialog.Builder(this)
        // Configurar el título y el mensaje de la alerta
        builder.setTitle("Alerta")
            .setMessage("¿Descargar en formato PDF?")
            // Configurar el botón positivo (Sí)
            .setPositiveButton("Sí") { dialog, which ->
                // Aquí puedes agregar el código para manejar la acción positiva
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
            // Configurar el botón negativo (No)
            .setNegativeButton("No") { dialog, which ->
                // Aquí puedes agregar el código para manejar la acción negativa
            }
        // Mostrar la alerta
        val dialog = builder.create()
        dialog.show()
    }
}
