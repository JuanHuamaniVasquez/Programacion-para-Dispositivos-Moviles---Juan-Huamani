/*
Descripción: Actividad principal que contiene el NavHostFragment para manejar la navegación entre fragments.
Autor: Juan José Huamani Vásquez
Fecha creación: 01/10/2025
Última modificación: 01/10/2025
*/

package com.example.configuradorpedidoscomida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establece el layout "activity_main.xml" como vista principal de esta actividad.
        // Dentro de este layout existe un NavHostFragment que gestionará la navegación entre fragments.
        setContentView(R.layout.activity_main)
    }
}
