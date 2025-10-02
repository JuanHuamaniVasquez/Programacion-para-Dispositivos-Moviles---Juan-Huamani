/*
Descripción: Fragmento donde el usuario selecciona extras para su pedido.
Autor: Juan José Huamani Vásquez
Fecha creación: 01/10/2025
Última modificación: 02/10/2025
*/

package com.example.configuradorpedidoscomida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.navigation.fragment.findNavController

class SeleccionExtrasFragment : Fragment(R.layout.fragment_seleccion_extras) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Botón para continuar al resumen
        val btnSiguiente = view.findViewById<Button>(R.id.btnSiguienteExtras)

        // Listener para el botón
        btnSiguiente.setOnClickListener {
            val bebida = view.findViewById<CheckBox>(R.id.cbBebida).isChecked
            val papas = view.findViewById<CheckBox>(R.id.cbPapas).isChecked
            val postre = view.findViewById<CheckBox>(R.id.cbPostre).isChecked

            // Recuperamos del bundle anterior la comida seleccionada en el fragmento anterior
            val comida = arguments?.getString("comida") ?: ""

            // Creamos un nuevo bundle con toda la info del pedido
            val bundle = Bundle().apply {
                putString("comida", comida)
                putBoolean("bebida", bebida)
                putBoolean("papas", papas)
                putBoolean("postre", postre)
            }

            // Navegamos al resumen del pedido, enviando el bundle
            findNavController().navigate(R.id.action_seleccionExtrasFragment_to_resumenPedidoFragment, bundle)
        }
    }
}
