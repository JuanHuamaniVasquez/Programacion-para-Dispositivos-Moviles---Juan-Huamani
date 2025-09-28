package com.example.editodenotas

/*
Descripción: Pantalla principal para escribir una nota rápida y enviarla a otra actividad.
Autor: Juan José Huamaní Vásquez
Fecha creación: 25/09/2025
Última modificación: 25/09/2025
*/

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
class EditorActivity : AppCompatActivity() {
    private lateinit var etNota: EditText

    // Launcher para recibir resultados de OpcionesActivity
    private val opcionesLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val notaDevuelta = result.data?.getStringExtra("nota")
            etNota.setText(notaDevuelta)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNota = findViewById(R.id.etNota)
        val btnCompartir: Button = findViewById(R.id.btnCompartir)

        btnCompartir.setOnClickListener {
            val nota = etNota.text.toString()
            val intent = Intent(this, OpcionesActivity::class.java)
            intent.putExtra("nota", nota)
            opcionesLauncher.launch(intent)
        }

        // Restaurar nota al rotar
        if (savedInstanceState != null) {
            etNota.setText(savedInstanceState.getString("nota"))
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nota", etNota.text.toString())
    }
}