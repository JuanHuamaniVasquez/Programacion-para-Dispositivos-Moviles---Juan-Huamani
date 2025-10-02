/*
Descripción: Fragmento de inicio con botón para crear un nuevo pedido.
Autor: Juan José Huamani Vásquez
Fecha creación: 01/10/2025
Última modificación: 01/10/2025
*/

package com.example.configuradorpedidoscomida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class InicioFragment : Fragment(R.layout.fragment_inicio) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Obtenemos la referencia al botón definido en el layout con id "btnNuevoPedido"
        val btnNuevoPedido = view.findViewById<Button>(R.id.btnNuevoPedido)
        // Configuramos un listener: al hacer clic se navega hacia el fragmento de selección de comida
        btnNuevoPedido.setOnClickListener {
            // Se usa el NavController para movernos desde InicioFragment hasta SeleccionComidaFragment
            findNavController().navigate(R.id.action_inicioFragment_to_seleccionComidaFragment)
        }
    }
}
