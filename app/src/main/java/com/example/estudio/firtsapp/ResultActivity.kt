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
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inflar el diseño de la actividad ResultActivity
        setContentView(R.layout.activity_result)

        // Configurar los botones después de inflar el diseño
        val btnInicio = findViewById<Button>(R.id.btnInicio)
        val btnDeberes = findViewById<Button>(R.id.btnDeberes)
        val btnDerechos = findViewById<Button>(R.id.btnDerechos)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)
        val imageDocum = findViewById<ImageView>(R.id.imageDocum)
        val textView7 = findViewById<TextView>(R.id.textView5)
        val textViewPerfil = findViewById<TextView>(R.id.textView7)
        val imageUsuario = findViewById<ImageView>(R.id.imageUsuar)


        // Configurar el OnClickListener para el button2 después de inflar el diseño
        button2.setOnClickListener {
            val intent = Intent(this, FacturaActivity::class.java)
            startActivity(intent)
        }


// Configurar el OnClickListener para el button4 después de inflar el diseño
        button4.setOnClickListener {
            val intent = Intent(this, MemorandoActivity::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, CompraActivity::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this, ProduccionActivity::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this, VentasActivity::class.java)
            startActivity(intent)
        }
        imageDocum.setOnClickListener {
            val intent = Intent(this, DocumentoActivity::class.java)
            startActivity(intent)
        }

// Configurar OnClickListener para el TextView
        textView7.setOnClickListener {
            val intent = Intent(this, DocumentoActivity::class.java)
            startActivity(intent)
        }

        textViewPerfil.setOnClickListener {
            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
        }

// Configurar OnClickListener para el ImageView
        imageUsuario.setOnClickListener {
            val intent = Intent(this, PerfilActivity::class.java)
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
