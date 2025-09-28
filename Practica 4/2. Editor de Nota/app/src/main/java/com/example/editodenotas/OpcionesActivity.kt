package com.example.editodenotas

/*
Descripción: Pantalla que muestra la nota y permite compartirla o volver a editar.
Autor: Juan José Huamaní Vásquez
Fecha creación: 25/09/2025
Última modificación: 25/09/2025
*/

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OpcionesActivity : AppCompatActivity() {
    private var nota: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        nota = intent.getStringExtra("nota")

        val tvNota: TextView = findViewById(R.id.tvNota)
        val btnCorreo: Button = findViewById(R.id.btnCorreo)
        val btnEditar: Button = findViewById(R.id.btnEditar)

        tvNota.text = nota

        btnCorreo.setOnClickListener {
            Toast.makeText(this, "Compartido por correo", Toast.LENGTH_SHORT).show()
            setResult(Activity.RESULT_OK, intent) // No devolvemos nada especial
            finish()
        }

        btnEditar.setOnClickListener {
            val intent = intent
            intent.putExtra("nota", nota)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}