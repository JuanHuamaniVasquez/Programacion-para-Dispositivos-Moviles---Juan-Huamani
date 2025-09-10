    package com.example.a1_interaccionimagenes

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.widget.Toast.makeText

    class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.drawable.button)

        img.setOnClickListener {
            Toast.makeText(this, "¡Hiciste clic en la imagen!", Toast.LENGTH_SHORT).show()
        }

    }
}