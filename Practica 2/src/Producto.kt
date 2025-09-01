/*
Descripción: Clase Producto que administra un precio y un descuento aplicable.
Permite consultar y modificar precio y descuento mediante getters y setters validados.
Incluye metodo calcularPrecioFinal que devuelve el precio con el descuento aplicado.
Autor: Juan José Huamaní Vásquez
Fecha creación: 01/09/2025
Fecha última modificación: 01/09/2025
*/

/*
Clase que modela un producto con precio y descuento.
Se aplican principios de encapsulamiento (atributos privados),
cohesión (cada metodo cumple una función específica)
y modularidad (separación entre lógica de negocio y pruebas en main).
*/
class Producto(
    private var precio: Double,     // Precio base del producto
    private var descuento: Double   // Descuento aplicable en porcentaje (0 a 100)
) {
    /*
    Get y set para el precio.
    Incluye validación al asignar (no se aceptan valores negativos).
    */
    fun setPrecio(precio: Double) {
        if (precio >= 0) this.precio = precio
        else println(" Error: el precio no puede ser negativo")
    }
    fun getPrecio(): Double {
        return this.precio
    }

    /*
    Get y set para el descuento.
    Se asegura que el descuento esté entre 0% y 100%.
    */
    fun setDescuento(descuento: Double) {
        if (descuento in 0.0..100.0) this.descuento = descuento
        else println(" Error: el descuento debe estar entre 0% y 100%")
    }
    fun getDescuento(): Double {
        return this.descuento
    }

    /*
    Metodo para calcular el precio final después de aplicar el descuento.
    Retorna el precio con el descuento aplicado.
    */
    fun calcularPrecioFinal(): Double {
        val precioFinal = precio - (precio * (descuento / 100))
        return precioFinal
    }
}

/*
Función principal para probar la clase Producto.
Se prueban distintos escenarios de uso y validación.
*/
fun main() {
    val producto = Producto(200.0, 10.0)

    println("Precio inicial: ${producto.getPrecio()}")
    println("Descuento aplicado: ${producto.getDescuento()}%")
    println("Precio final: ${producto.calcularPrecioFinal()}")

    // Pruebas de validación
    producto.setPrecio(-50.0)   // Precio inválido
    producto.setDescuento(150.0) // Descuento inválido

    // Cambio válido
    producto.setPrecio(300.0)
    producto.setDescuento(20.0)
    println("Precio modificado: ${producto.getPrecio()}")
    println("Descuento aplicado: ${producto.getDescuento()}%")
    println("Nuevo precio final: ${producto.calcularPrecioFinal()}")
}
