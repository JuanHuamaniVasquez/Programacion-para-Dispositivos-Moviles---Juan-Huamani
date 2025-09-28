# Práctica 4 – Comunicación entre Actividades (Android con Kotlin)

Este repositorio contiene dos aplicaciones Android desarrolladas en **Kotlin** que practican la comunicación entre actividades, el envío de datos con `Intent`, la recepción de resultados con `registerForActivityResult`, y la conservación del estado al rotar la pantalla mediante `onSaveInstanceState()`.

---

## Contenido de la práctica

### 1. Editor de Perfil con Confirmación
**Objetivo:**  
Permitir al usuario llenar un perfil de usuario, mostrar los datos en otra pantalla y confirmar si la información está correcta.

**Características:**
- **FormularioActivity**  
  - Campos: Nombre, Edad, Ciudad y Correo electrónico.  
  - Botón **Continuar** que envía los datos a la segunda actividad.  
- **ResumenActivity**  
  - Muestra el resumen del perfil ingresado.  
  - Botón **Confirmar** → vuelve a la primera pantalla y muestra un `Toast` con el mensaje *"Perfil guardado correctamente"*.  
  - Botón **Volver a editar** → retorna a la primera pantalla para modificar la información.  
- Conserva los datos escritos al rotar el dispositivo.  

---

### 2. Editor de Nota Rápida
**Objetivo:**  
Permitir al usuario escribir una nota, enviarla a otra pantalla para decidir si compartirla o volver a editarla.

**Características:**
- **EditorActivity**  
  - Campo de texto para escribir la nota.  
  - Botón **Compartir** que envía la nota a la segunda actividad.  
- **OpcionesActivity**  
  - Muestra la nota recibida.  
  - Botón **Compartir por correo** → muestra un `Toast` con el mensaje *"Compartido por correo"*.  
  - Botón **Editar de nuevo** → regresa a la pantalla anterior con el texto para seguir editando.  
- Conserva la nota escrita al rotar la pantalla.  

---

## Requisitos
- Android Studio.
- SDK de Android 33 o superior.
- Kotlin habilitado como lenguaje principal.

---

## Ejecución

### Usando GitHub Desktop y Android Studio
1. Clonar el repositorio desde GitHub utilizando GitHub Desktop.  
   - Seleccionar **File > Clone Repository** y ubicar el proyecto en la carpeta de trabajo local.
2. Abrir Android Studio y seleccionar **Open Project**.
3. Esperar a que Gradle sincronice las dependencias automáticamente.
4. Conectar un dispositivo físico o abrir un emulador de Android.
5. Ejecutar la aplicación con el botón **Run** en Android Studio.
6. Probar las funcionalidades:  
   - En el Ejercicio 1, tocar la imagen para mostrar el mensaje.  
   - En el Ejercicio 2, usar los botones para controlar la música.

---

## Documentación adicional
- Se incluye este archivo README.md que describe el proyecto, sus ejercicios y los pasos necesarios para ejecutarlo.
- Cada script en Kotlin contiene un comentario inicial con:
  - Descripción del problema
  - Autor
  - Fecha de creación
  - Última modificación

---

## Autor
- Nombre: Juan José Huamaní Vásquez
- Fecha: 27/09/2025  
