/*
Descripción: Clase CuentaBancaria que administra un saldo y un límite de retiro.
Permite consultar y modificar saldo y límite mediante getters y setters validados.
Incluye metodo retirar con validaciones de monto, límite y fondos suficientes.
Autor: Juan José Huamaní Vásquez
Fecha creación: 31/08/2025
Fecha última modificación: 01/09/2025
*/

/*
Clase que modela una cuenta bancaria básica.
Se aplican principios de encapsulamiento (atributos privados),
cohesión (cada metodo cumple una función específica)
y modularidad (separación entre lógica de negocio y pruebas en main).
*/
class CuentaBancaria(
    private var saldo: Double,         // Saldo actual de la cuenta
    private var limiteRetiro: Double   // Límite máximo permitido para un retiro
) {
    /*
    Get y set para el saldo
    Incluye validación al asignar (no se aceptan valores negativos).
    */
    fun setSaldo(saldo: Double) {
        if (saldo >= 0 ) this.saldo = saldo else println(" Error: el saldo no puede ser negativo")
    }
    fun getSaldo(): Double {
        return this.saldo
    }
    /*
    Get y set para el límite de retiro.
    Se asegura que el límite siempre sea mayor a 0.
    */
    fun setLimiteRetiro(limititeRetiro: Double) {
        if (limititeRetiro > 0 ) this.limiteRetiro = limititeRetiro else println(" Error: el límite de retiro debe ser mayor a 0.\"")
    }
    fun getLimiteRetiro(): Double {
        return this.limiteRetiro
    }
    /*
    Metodo para realizar un retiro de la cuenta.
    Valida monto positivo, límite permitido y disponibilidad de fondos.
    */
    fun retirar(monto: Double) {
        when {
            monto <= 0 -> println(" El monto a retirar debe ser mayor que 0.")
            monto > getSaldo() -> println(" Fondos insuficientes. Saldo disponible: ${getSaldo()}.")
            monto > getLimiteRetiro() -> println(" El monto excede el límite de retiro (${getLimiteRetiro()}).")

            else -> {
                setSaldo(getSaldo()-monto)
                println(" Retiro de $monto exitoso. Saldo restante: ${getSaldo()}")
            }
        }
    }
}

/*
Función principal para probar la clase CuentaBancaria.
Se prueban distintos escenarios de uso y validación.
*/
fun main() {
    val cuenta = CuentaBancaria(1000.0, 500.0)

    println("Saldo inicial: ${cuenta.getSaldo()}")
    println("Límite de retiro: ${cuenta.getLimiteRetiro()}")

    // Pruebas de retiros con distintas validaciones
    cuenta.retirar(600.0)   //  Excede el límite
    cuenta.retirar(1200.0)  //  Excede el saldo
    cuenta.retirar(300.0)   //  Retiro válido

    // Intentos de asignación inválida
    cuenta.setSaldo(-100.0)
    cuenta.setLimiteRetiro(-50.0)
}
