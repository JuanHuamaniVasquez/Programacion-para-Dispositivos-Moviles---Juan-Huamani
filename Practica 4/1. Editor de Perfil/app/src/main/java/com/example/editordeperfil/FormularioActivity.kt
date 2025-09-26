package com.example.editordeperfil

/*
Descripción: Pantalla quue permite llenar un perfil de Usuario (Nombre, edad, ciudad, correo)
Autor: Juan José Huamaní Vásquez
Fecha creación: 25/09/2025
Última modificación: 25/09/2025
*/

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {
   // Variables con los campos del formulario
    private lateinit var etNombre: EditText
    private lateinit var etEdad: EditText
    private lateinit var etCiudad: EditText
    private lateinit var etCorreo: EditText

    // Registrar callback para recibir resultados
    private val resumenLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            Toast.makeText(this, "Perfil guardado correctamente", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vincula cada EditText con su elemento en el layout
        etNombre = findViewById(R.id.etNombre)
        etEdad = findViewById(R.id.etEdad)
        etCiudad = findViewById(R.id.etCiudad)
        etCorreo = findViewById(R.id.etCorreo)

        // Configuración del boton "Continuar"
        val btnContinuar: Button = findViewById(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val usuario = Usuario( // Crea un objeto Usuario
                etNombre.text.toString(),
                etEdad.text.toString(),
                etCiudad.text.toString(),
                etCorreo.text.toString()
            )
            val intent = Intent(this, ResumenActivity::class.java) // Crea el intent para ResumenActivity
            intent.putExtra("usuario", usuario) // Envial el objeto Usuario
            resumenLauncher.launch(intent) // Lanza la actividad ResumeActivity
        }

        // Restaurar estado si se rota o se vuelve a la actividad
        if (savedInstanceState != null) {
            etNombre.setText(savedInstanceState.getString("nombre"))
            etEdad.setText(savedInstanceState.getString("edad"))
            etCiudad.setText(savedInstanceState.getString("ciudad"))
            etCorreo.setText(savedInstanceState.getString("correo"))
        }
    }

    // Guarda el contenido de los campos en el Bundle para no perder información
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nombre", etNombre.text.toString())
        outState.putString("edad", etEdad.text.toString())
        outState.putString("ciudad", etCiudad.text.toString())
        outState.putString("correo", etCorreo.text.toString())
    }
}