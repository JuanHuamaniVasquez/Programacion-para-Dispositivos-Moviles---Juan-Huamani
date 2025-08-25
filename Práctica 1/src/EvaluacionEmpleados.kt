/*
    Descripción: Programa que evalúa el rendimiento de un empleado según su puntuación
    y calcula la cantidad de dinero que recibirá en base a su salario mensual.
    Autor: Juan José Huamaní Vásquez
    Fecha de creación: 25/08/2025
    Fecha última modificación: 25/08/2025
*/

fun main() {
    print("Ingrese su salario mensual: ")
    val salario = readln().toInt()

    print("Ingrese su puntuación (0 a 10): ")
    val puntuacion = readln().toInt()

    if (puntuacion !in 0..10) {
        println(" Puntuación inválida. Debe estar entre 0 y 10.")
        return
    }

    val nivel = obtenerNivel(puntuacion)
    val dineroRecibido = calcularDinero(salario, puntuacion)

    println("Nivel de Rendimiento: $nivel")
    println("Cantidad de Dinero Recibido: $dineroRecibido")
}

// Función para determinar el nivel de rendimiento
fun obtenerNivel(puntuacion: Int): String {
    return when (puntuacion) {
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "Desconocido"
    }
}

// Función para calcular el dinero recibido
fun calcularDinero(salario: Int, puntuacion: Int): Float {
    return salario * (puntuacion.toFloat() / 10)
}