/*
    Descripción: Calculadora básica que permite realizar operaciones de
                 suma, resta, multiplicación y división.
                 Incluye un menú de opciones y validación de entrada.
    Autor: Juan José Huamaní Vásquez
    Fecha de creación: 25/08/2025
    Fecha última modificación: 25/08/2025
*/

fun main() {
    var opcion: Int

    do {
        mostrarMenu()
        opcion = readln().toInt()

        when (opcion) {
            1 -> realizarOperacion("Suma")
            2 -> realizarOperacion("Resta")
            3 -> realizarOperacion("Multiplicación")
            4 -> realizarOperacion("División")
            5 -> println(" Saliendo del programa...")
            else -> println(" Opción inválida, intente nuevamente.")
        }
        println()
    } while (opcion != 5)
}

// Función que imprime el menú
fun mostrarMenu() {
    println("==== Menú ====")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. División")
    println("5. Salir")
    print("Seleccione una opción: ")
}

// Función que realiza la operación indicada
fun realizarOperacion(tipo: String) {
    print("Ingrese el primer número: ")
    val num1 = readln().toDouble()

    print("Ingrese el segundo número: ")
    val num2 = readln().toDouble()

    val resultado = when (tipo) {
        "Suma" -> num1 + num2
        "Resta" -> num1 - num2
        "Multiplicación" -> num1 * num2
        "División" -> {
            if (num2 == 0.0) {
                println(" Error: No se puede dividir entre 0.")
                return
            } else {
                num1 / num2
            }
        }
        else -> 0.0
    }
    println("Resultado de la $tipo: $resultado")
}
