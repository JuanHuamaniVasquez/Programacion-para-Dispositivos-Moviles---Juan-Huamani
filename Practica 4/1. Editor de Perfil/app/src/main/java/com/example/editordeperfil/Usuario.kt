/*
Descripción: Clase de datos serializable para representar un perfil de usuario.
Autor: Juan José Huamaní Vásquez
Fecha creación: 25/09/2025
Última modificación: 25/09/2025
*/
package com.example.editordeperfil

import java.io.Serializable

data class Usuario(
    val nombre: String,
    val edad: String,
    val ciudad: String,
    val correo: String
) : Serializable
