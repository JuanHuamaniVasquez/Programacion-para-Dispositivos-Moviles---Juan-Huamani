/*
    Descripción: Juego "Adivina el Número". El programa genera un número aleatorio
                 entre 1 y 30, el usuario tiene 5 intentos para adivinarlo.
                 Se da una pista indicando si el número es mayor o menor.
                 Si se acaban los intentos, se muestra "Game Over".
    Autor: Juan José Huamaní Vásquez
    Fecha de creación: 25/08/2025
    Fecha última modificación: 25/08/2025
*/

fun adivinarNumero() {
    val numeroSecreto = (1..30).random()
    val intentosMax = 5
    var intentos = 0
    var adivinado = false

    println("Adivina el Número (1 - 30)")
    println("Tienes $intentosMax intentos para adivinarlo.\n")

    while (intentos < intentosMax && !adivinado) {
        print("Intento ${intentos + 1}: Ingresa tu número: ")
        val intentoUsuario = readln().toIntOrNull()

        if (intentoUsuario == null || intentoUsuario !in 1..30) {
            println(" Ingresa un número válido entre 1 y 30.")
            continue
        }

        intentos++

        when {
            intentoUsuario == numeroSecreto -> {
                println("¡Felicidades! Adivinaste el número en $intentos intentos.")
                adivinado = true
            }
            intentoUsuario < numeroSecreto -> println("El número secreto es mayor ")
            else -> println("El número secreto es menor ")
        }
    }

    if (!adivinado) {
        println(" Perdiste :( El número era: $numeroSecreto")
    }
}
