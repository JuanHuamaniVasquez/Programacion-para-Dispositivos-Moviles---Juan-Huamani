/*
Descripción: Fragmento donde el usuario selecciona el tipo de comida.
Autor: Juan José Huamani Vásquez
Fecha creación: 01/10/2025
Última modificación: 02/10/2025
*/

package com.example.configuradorpedidoscomida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class SeleccionComidaFragment : Fragment(R.layout.fragment_seleccion_comida) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Referencia al botón "Siguiente"
        val btnSiguiente = view.findViewById<Button>(R.id.btnSiguienteComida)
        // Referencia al RadioGroup que contiene las opciones de comida
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroupComida)

        parentFragmentManager.setFragmentResultListener("editarPedido", viewLifecycleOwner) { _, bundle ->
            val comidaEditada = bundle.getString("comida", "")

            // Buscar el RadioButton que coincida con la comida anterior y marcarlo
            for (i in 0 until radioGroup.childCount) {
                val radioButton = radioGroup.getChildAt(i) as RadioButton
                if (radioButton.text.toString() == comidaEditada) {
                    radioButton.isChecked = true
                    break
                }
            }
        }


        // Acción al hacer clic en el botón
        btnSiguiente.setOnClickListener {
            // Obtiene el id del RadioButton seleccionado
            val selectedId = radioGroup.checkedRadioButtonId

            if (selectedId != -1) { // Si hay una opción marcada
                // Recupera el RadioButton seleccionado usando su id
                val radioButton = view.findViewById<RadioButton>(selectedId)
                // Convierte el texto del RadioButton en String ("Pizza", "Hamburguesa")
                val comida = radioButton.text.toString()

                // Crea un Bundle para enviar la info al siguiente fragmento
                val bundle = Bundle()
                bundle.putString("comida", comida) // clave: "comida", valor: texto seleccionado

                // Navega al siguiente fragmento (SeleccionExtrasFragment) pasando el bundle
                findNavController().navigate(
                    R.id.action_seleccionComidaFragment_to_seleccionExtrasFragment,
                    bundle
                )
            } else {
                // Si no seleccionó nada, muestra un mensaje
                Toast.makeText(requireContext(), "Debes seleccionar una comida", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
