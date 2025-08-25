/*
    Descripción: Juego de Piedra, Papel o Tijera contra la computadora.
                 La computadora elige una opción al azar y el usuario
                 debe seleccionar su jugada. El programa determina
                 si el usuario gana, pierde o empata.
    Autor: Juan José Huamaní Vásquez
    Fecha de creación: 25/08/2025
    Fecha última modificación: 25/08/2025
*/

fun main() {
    // Se decidio usar números para las opciones para reducir la complejidad
    val opciones = (1..3).random()
    print("Elija un número (Piedra (1) --- Papel (2) --- Tijera (3) :")

    val eleccionUsuario = readln().toInt()

    if (eleccionUsuario !in 1..3) {
        println(" Opción inválida. Debe ser 1, 2 o 3.")
        return
    }

    println("Computadora eligió: ${determinarOpcion(opciones)}")
    println("Usted eligió: ${determinarOpcion(eleccionUsuario)}")

    val resultado = determinarResultado(eleccionUsuario, opciones)
    println("Resultado: $resultado")
}

// Función que determina el resultado
fun determinarResultado(usuario: Int, computadora: Int): String {
    return if (usuario == computadora) {
        "Empate"
    } else if (
        (usuario == 1 && computadora == 3) ||
        (usuario == 2 && computadora == 1) ||
        (usuario == 3 && computadora == 2)
    ) {
        "Ganaste!!!"
    } else {
        "Perdiste :("
    }
}
// Función para convertir un número a opción
fun determinarOpcion(opcion: Int): String {
    return when (opcion) {
        1 -> "Piedra"
        2 -> "Papel"
        3 -> "Tijera"
        else -> "Inválido"
    }
}