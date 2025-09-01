#  Proyecto de Ejercicios en Kotlin  

Este repositorio contiene una serie de ejercicios prácticos desarrollados en **Kotlin**, aplicando principios de **Programación Orientada a Objetos (POO)** como encapsulamiento, herencia, polimorfismo, modularidad y cohesión.  
Cada ejercicio está implementado en un archivo independiente y cuenta con comentarios explicativos y validaciones en los métodos.  

---

##  Contenido del Proyecto  

### 1. **Cuenta Bancaria**
- Clase `CuentaBancaria` que administra un **saldo** y un **límite de retiro**.  
- Métodos `get` y `set` con validaciones para saldo y límite.  
- Método `retirar()` con validaciones de monto, límite y fondos disponibles.  

### 2. **Producto**
- Clase `Producto` que administra un **precio** y un **descuento**.  
- Métodos `get` y `set` con validaciones para valores válidos.  
- Método `calcularPrecioFinal()` que retorna el precio con descuento aplicado.  

### 3. **Figuras (Shape)**
- Clase abstracta `Shape` con propiedades **área** y **perímetro**.  
- Subclases: `Cuadrado`, `Rectángulo`, `Círculo`.  
- Métodos para calcular e imprimir área y perímetro en cada subclase.  

### 4. **Sistema de Gestión de Biblioteca**
- Clase abstracta `Material` con propiedades comunes (`título`, `autor`, `año`).  
- Subclases: `Libro` y `Revista` con atributos adicionales.  
- Data class `Usuario` para representar lectores.  
- Interfaz `IBiblioteca` con operaciones principales: registrar materiales/usuarios, préstamo, devolución, mostrar materiales.  
- Clase `Biblioteca` que implementa la interfaz y gestiona materiales con **listas y mapas**.  

---

##  Tecnologías Utilizadas  
- Lenguaje: **Kotlin**  
- Paradigma: **Programación Orientada a Objetos (POO)**  
- Entorno: Compatible con **IntelliJ IDEA**

---


---

##  Ejecución del Proyecto  

### 1. Clonar el repositorio con **GitHub Desktop**  
1. Abre **GitHub Desktop**.  
2. Haz clic en **File > Clone repository...**.  
3. Copia la URL del repositorio o selecciónalo de tu cuenta.  
4. Elige la carpeta local donde se guardará el proyecto y haz clic en **Clone**.  

### 2. Abrir el proyecto en **IntelliJ IDEA**  
1. Abre **IntelliJ IDEA**.  
2. Selecciona **File > Open...** y abre la carpeta donde clonaste el repositorio.  
3. Espera a que IntelliJ descargue las dependencias y configure el entorno Kotlin.  

### 3. Ejecutar un ejercicio  
1. Dentro de IntelliJ, abre el archivo del ejercicio que desees ejecutar dentro de **/src**.  
2. Haz clic en el ícono **Run** en la parte superior o junto a la función `main`.  
3. Observa la salida en la **consola** de IntelliJ.  

---

##  Autor

### Juan José Huamaní Vásquez
- Creación: 31/08/2025
- Última modificación: 01/09/2025

