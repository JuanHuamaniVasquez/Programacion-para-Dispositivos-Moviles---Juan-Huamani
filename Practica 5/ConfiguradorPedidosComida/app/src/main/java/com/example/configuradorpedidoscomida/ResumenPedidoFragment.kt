/*
Descripción: Fragmento que muestra el resumen del pedido y permite confirmar o editar.
Autor: Juan José Huamani Vásquez
Fecha creación: 01/10/2025
Última modificación: 02/10/2025
*/

package com.example.configuradorpedidoscomida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController

class ResumenPedidoFragment : Fragment(R.layout.fragm   ent_resumen_pedido) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Recuperamos los datos que fueron enviados desde SeleccionExtrasFragment
        val comida = arguments?.getString("comida") ?: "No seleccionada"
        val bebida = arguments?.getBoolean("bebida") ?: false
        val papas = arguments?.getBoolean("papas") ?: false
        val postre = arguments?.getBoolean("postre") ?: false

        // Texto de resumen
        val resumenText = """
            Comida: $comida
            Extras:
              - Bebida: ${if (bebida) "Sí" else "No"}
              - Papas: ${if (papas) "Sí" else "No"}
              - Postre: ${if (postre) "Sí" else "No"}
        """.trimIndent()

        view.findViewById<TextView>(R.id.tvResumen).text = resumenText

        // Referencias a los botones
        val btnConfirmar = view.findViewById<Button>(R.id.btnConfirmar)
        val btnEditar = view.findViewById<Button>(R.id.btnEditar)

        // Acción al confirmar pedido
        btnConfirmar.setOnClickListener {
            Toast.makeText(requireContext(), "Pedido confirmado", Toast.LENGTH_SHORT).show()
            // Navegamos de regreso al fragmento de inicio
            findNavController().navigate(R.id.action_resumenPedidoFragment_to_inicioFragment)
        }

        // Acción al editar pedido
        btnEditar.setOnClickListener {
            // Creamos un bundle con los datos actuales
            val bundle = Bundle().apply {
                putString("comida", comida)
                putBoolean("bebida", bebida)
                putBoolean("papas", papas)
                putBoolean("postre", postre)
            }
            // Enviamos los datos hacia atrás usando setFragmentResult
            setFragmentResult("editarPedido", bundle)
            // Volvemos al fragmento de selección de comida (sin destruirlo)
            findNavController().popBackStack(R.id.seleccionComidaFragment, false)
        }
    }
}
