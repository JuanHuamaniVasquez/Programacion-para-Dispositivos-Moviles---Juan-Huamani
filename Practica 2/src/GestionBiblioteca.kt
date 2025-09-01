/*
Descripción: Sistema de Gestión de Biblioteca que permite registrar materiales, usuarios,
realizar préstamos y devoluciones. Incluye clases para Material, Libro, Revista, Usuario,
una interfaz IBiblioteca con las operaciones principales, y una clase Biblioteca que implementa
la interfaz y gestiona los préstamos y devoluciones.
Autor: Juan José Huamaní Vásquez
Fecha creación: 01/09/2025
Fecha última modificación: 01/09/2025
*/

/*
Clase abstracta Material que sirve como base para libros y revistas.
Incluye propiedades comunes y un metodo abstracto para mostrar detalles.
*/
abstract class Material(val titulo: String, val autor: String, val anioPublicacion: Int) {
    abstract fun mostrarDetalles()
}

/*
Subclase Libro que hereda de Material.
Incluye género y número de páginas como propiedades adicionales.
*/
class Libro(titulo: String, autor: String, anioPublicacion: Int,
            private val genero: String,
            private val numeroPaginas: Int
) : Material(titulo, autor, anioPublicacion) {
    override fun mostrarDetalles() {
        println(" Libro: $titulo, Autor: $autor, Año: $anioPublicacion, Género: $genero, Páginas: $numeroPaginas")
    }
}

/*
Subclase Revista que hereda de Material.
Incluye ISSN, volumen, número y editorial como propiedades adicionales.
*/
class Revista(titulo: String, autor: String, anioPublicacion: Int,
              private val issn: String,
              private val volumen: Int,
              private val numero: Int,
              private val editorial: String
) : Material(titulo, autor, anioPublicacion) {
    override fun mostrarDetalles() {
        println(" Revista: $titulo, Autor: $autor, Año: $anioPublicacion, ISSN: $issn, Volumen: $volumen, Número: $numero, Editorial: $editorial")
    }
}

/*
Data class Usuario que representa un lector de la biblioteca.
*/
data class Usuario(val nombre: String, val apellido: String, val edad: Int)

/*
Interfaz IBiblioteca que define las operaciones principales de gestión.
*/
interface IBiblioteca {
    fun registrarMaterial(material: Material)
    fun registrarUsuario(usuario: Usuario)
    fun prestarMaterial(usuario: Usuario, material: Material)
    fun devolverMaterial(usuario: Usuario, material: Material)
    fun mostrarMaterialesDisponibles()
    fun mostrarMaterialesReservadosPorUsuario(usuario: Usuario)
}

/*
Clase Biblioteca que implementa la interfaz IBiblioteca.
Gestiona materiales disponibles y préstamos con un Map de usuarios y materiales en préstamo.
*/
class Biblioteca : IBiblioteca {
    private val materialesDisponibles = mutableListOf<Material>()
    private val prestamos = mutableMapOf<Usuario, MutableList<Material>>()
    private val usuariosRegistrados = mutableListOf<Usuario>()

    override fun registrarMaterial(material: Material) {
        materialesDisponibles.add(material)
        println(" Material registrado: ${material.titulo}")
    }

    override fun registrarUsuario(usuario: Usuario) {
        usuariosRegistrados.add(usuario)
        println(" Usuario registrado: ${usuario.nombre} ${usuario.apellido}")
    }

    override fun prestarMaterial(usuario: Usuario, material: Material) {
        if (!usuariosRegistrados.contains(usuario)) {
            println(" Usuario no registrado en la biblioteca.")
            return
        }
        if (materialesDisponibles.contains(material)) {
            materialesDisponibles.remove(material)
            prestamos.computeIfAbsent(usuario) { mutableListOf() }.add(material)
            println(" Préstamo realizado: ${material.titulo} → ${usuario.nombre}")
        } else {
            println(" El material '${material.titulo}' no está disponible.")
        }
    }

    override fun devolverMaterial(usuario: Usuario, material: Material) {
        val materialesUsuario = prestamos[usuario]
        if (materialesUsuario != null && materialesUsuario.contains(material)) {
            materialesUsuario.remove(material)
            materialesDisponibles.add(material)
            println(" Devolución realizada: ${material.titulo} ← ${usuario.nombre}")
        } else {
            println(" El material '${material.titulo}' no está en préstamo por ${usuario.nombre}.")
        }
    }

    override fun mostrarMaterialesDisponibles() {
        println("\n Materiales disponibles en la biblioteca:")
        if (materialesDisponibles.isEmpty()) {
            println("No hay materiales disponibles.")
        } else {
            materialesDisponibles.forEach { it.mostrarDetalles() }
        }
    }

    override fun mostrarMaterialesReservadosPorUsuario(usuario: Usuario) {
        println("\n Materiales en préstamo por ${usuario.nombre} ${usuario.apellido}:")
        val materialesUsuario = prestamos[usuario]
        if (materialesUsuario.isNullOrEmpty()) {
            println("El usuario no tiene materiales en préstamo.")
        } else {
            materialesUsuario.forEach { it.mostrarDetalles() }
        }
    }
}

/*
Función principal para probar el sistema de biblioteca.
*/
fun main() {
    val biblioteca = Biblioteca()

    // Crear usuarios
    val usuario1 = Usuario("Ana", "Gonzales", 28)
    val usuario2 = Usuario("Carlos", "Ballarta", 31)

    // Registrar usuarios
    biblioteca.registrarUsuario(usuario1)
    biblioteca.registrarUsuario(usuario2)

    // Crear materiales
    val libro1 = Libro("Harry Potter y la piedra filosofal.", "Rowling, J. K.", 1999, "Ciencia Ficción", 264)
    val revista1 = Revista("National Geographic", "Varios", 2025, "123456", 10, 1, "NatGeo")

    // Registrar materiales
    biblioteca.registrarMaterial(libro1)
    biblioteca.registrarMaterial(revista1)

    // Mostrar materiales disponibles
    biblioteca.mostrarMaterialesDisponibles()

    // Prestar material
    biblioteca.prestarMaterial(usuario1, libro1)
    biblioteca.prestarMaterial(usuario2, revista1)

    // Mostrar materiales por usuario
    biblioteca.mostrarMaterialesReservadosPorUsuario(usuario1)
    biblioteca.mostrarMaterialesReservadosPorUsuario(usuario2)

    // Devolución
    biblioteca.devolverMaterial(usuario1, libro1)

    // Mostrar disponibles después de devolución
    biblioteca.mostrarMaterialesDisponibles()
}
