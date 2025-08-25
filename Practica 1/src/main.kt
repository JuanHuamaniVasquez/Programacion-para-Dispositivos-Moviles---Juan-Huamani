/*
    Descripción: Programa principal de la Práctica 1 en Kotlin.
                 Presenta un menú interactivo con cuatro ejercicios:
                 1) Evaluación Empleados
                 2) Piedra, Papel y Tijeras
                 3) Calculadora Elemental
                 4) Adivina Número
                 El usuario puede seleccionar el ejercicio que desea ejecutar,
                 y el programa llamará a la función correspondiente.
                 Incluye validación de opciones y la posibilidad de salir.    Autor: Juan José Huamaní Vásquez
    Fecha de creación: 25/08/2025
    Fecha última modificación: 25/08/2025
*/

fun main() {
    var opcion: Int
    do {
        menu()
        opcion = readln().toInt()
        when (opcion) {
            1 -> ejecutarEjercicio("Evaluación Empleados")
            2 -> ejecutarEjercicio("Piedra, Papel y Tijeras")
            3 -> ejecutarEjercicio("Calculadora Elemental")
            4 -> ejecutarEjercicio("Adivina Número")
            5 -> println(" Saliendo del programa...")
            else -> println(" Opción inválida, intente nuevamente.")
        }
        println()
    } while (opcion != 5)
}

fun menu(){
    println("======= Menú de Practica 1 =======")
    println("1. Evaluación Empleados")
    println("2. Piedra, Papel y Tijeras")
    println("3. Calculadora Elemental")
    println("4. Adivina Número")
    println("5. Salir")
    print("Seleccione una opción: ")
}

fun ejecutarEjercicio(ejercicio: String) {
    when (ejercicio) {
        "Evaluación Empleados" -> evaluacionEmpleados()
        "Piedra, Papel y Tijeras" -> piedraPapelTijera()
        "Calculadora Elemental" -> calculadora()
        "Adivina Número" -> adivinarNumero()
    }
}
