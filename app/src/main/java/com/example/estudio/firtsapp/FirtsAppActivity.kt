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
import com.google.firebase.auth.FirebaseAuth
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.enableEdgeToEdge
import androidx.activity.enableEdgeToEdge
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class FirtsAppActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var authStateListener: FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firts_app)  // Mueve esta línea al principio

        val btnIngresar = findViewById<AppCompatButton>(R.id.btnStart)
        val txtpass = findViewById<AppCompatEditText>(R.id.etName)
        val  txtemail = findViewById<EditText>(R.id.etUsername)
        val textView7 = findViewById<TextView>(R.id.tvOlvd)

        textView7.setOnClickListener {
            val intent = Intent(this, OlvActivity::class.java)
            startActivity(intent)
        }
        firebaseAuth = Firebase.auth

        btnIngresar.setOnClickListener(){
            signIn(txtemail.text.toString(), txtpass.text.toString())
        }

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun signIn(email: String, password: String){
        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this){ task ->
            if(task.isSuccessful){
                val user = firebaseAuth.currentUser
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(baseContext, "error de email y/o contraseña", Toast.LENGTH_SHORT).show()

            }
        }
    }

}