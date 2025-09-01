/*
Descripción: Clase abstracta Shape que define propiedades y métodos comunes
para calcular área y perímetro. Se crean subclases Cuadrado, Rectangulo y
Circulo que heredan de Shape y sobreescriben los métodos correspondientes.
Autor: Juan José Huamaní Vásquez
Fecha creación: 01/09/2025
Fecha última modificación: 01/09/2025
*/

/*
Clase abstracta Shape que sirve como plantilla para cualquier figura geométrica.
Define propiedades área y perímetro, y funciones abstractas para calcular
e imprimir resultados.
*/
abstract class Shape {
    protected var area: Double = 0.0       // Propiedad del área
    protected var perimetro: Double = 0.0  // Propiedad del perímetro

    /*
    Métodos abstractos para calcular área y perímetro.
    Las subclases estarán obligadas a implementarlos.
    */
    abstract fun calcularArea()
    abstract fun calcularPerimetro()

    /*
    Métodos concretos para imprimir los resultados de los cálculos.
    */
    fun imprimirArea() {
        println("Área: $area")
    }

    fun imprimirPerimetro() {
        println("Perímetro: $perimetro")
    }
}

/*
Subclase Cuadrado que hereda de Shape.
Recibe el valor de un lado e implementa los cálculos específicos.
*/
class Cuadrado(private var lado: Double) : Shape() {

    override fun calcularArea() {
        area = lado * lado
    }

    override fun calcularPerimetro() {
        perimetro = 4 * lado
    }
}

/*
Subclase Rectangulo que hereda de Shape.
Recibe valores de base y altura e implementa los cálculos específicos.
*/
class Rectangulo(private var base: Double, private var altura: Double) : Shape() {

    override fun calcularArea() {
        area = base * altura
    }

    override fun calcularPerimetro() {
        perimetro = 2 * (base + altura)
    }
}

/*
Subclase Circulo que hereda de Shape.
Recibe el valor del radio e implementa los cálculos específicos.
*/
class Circulo(private var radio: Double) : Shape() {

    override fun calcularArea() {
        area = Math.PI * radio * radio
    }

    override fun calcularPerimetro() {
        perimetro = 2 * Math.PI * radio
    }
}

/*
Función principal para probar las clases de figuras.
Crea instancias de Cuadrado, Rectángulo y Círculo y muestra
sus áreas y perímetros.
*/
fun main() {
    // Instancia de un cuadrado de lado 5
    val cuadrado = Cuadrado(5.0)
    cuadrado.calcularArea()
    cuadrado.calcularPerimetro()
    println("Cuadrado:")
    cuadrado.imprimirArea()
    cuadrado.imprimirPerimetro()

    // Instancia de un rectángulo de base 4 y altura 6
    val rectangulo = Rectangulo(4.0, 6.0)
    rectangulo.calcularArea()
    rectangulo.calcularPerimetro()
    println("\nRectángulo:")
    rectangulo.imprimirArea()
    rectangulo.imprimirPerimetro()

    // Instancia de un círculo con radio 3
    val circulo = Circulo(3.0)
    circulo.calcularArea()
    circulo.calcularPerimetro()
    println("\nCírculo (radio 3):")
    circulo.imprimirArea()
    circulo.imprimirPerimetro()

}
