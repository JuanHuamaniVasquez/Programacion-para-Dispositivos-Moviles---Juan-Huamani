package com.example.editordeperfil

/*
Descripción: Pantalla que muestra el resumen del perfil de usuario.
Autor: Juan José Huamaní Vásquez
Fecha creación: 25/09/2025
Última modificación: 25/09/2025
*/

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResumenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen) // Indica el layout a utilizar en esta pantalla

        val usuario = intent.getSerializableExtra("usuario", Usuario::class.java) // Recupera el objeto usuario del FormularioActivity con un intent
        val tvResumen: TextView = findViewById(R.id.tvResumen)
        tvResumen.text = getString( // Texto Formateado
            R.string.resumen_usuario,
            usuario?.nombre,
            usuario?.edad,
            usuario?.ciudad,
            usuario?.correo
        )
        // Referencias de los botones "Continuar" y "Volver a Editar"
        val btnConfirmar: Button = findViewById(R.id.btnConfirmar)
        val btnEditar: Button = findViewById(R.id.btnEditar)

        btnConfirmar.setOnClickListener {
            setResult(Activity.RESULT_OK) // Devuelve OK
            finish() // Cierra la actividad
        }

        btnEditar.setOnClickListener {
            setResult(Activity.RESULT_CANCELED) // Devuelve Cancelado
            finish() // Cierra la actividad
        }
    }
}
