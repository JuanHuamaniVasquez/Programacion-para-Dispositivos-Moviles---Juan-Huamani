    package com.example.a1_interaccionimagenes

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.widget.Toast.makeText

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al ImageView
        val imagen = findViewById<ImageView>(R.id.miImagen)

        // Evento de clic
        imagen.setOnClickListener {
            Toast.makeText(this, R.string.click_imagen, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, R.string.click_imagen2, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, R.string.click_imagen3, Toast.LENGTH_SHORT).show()

        }


    }
}