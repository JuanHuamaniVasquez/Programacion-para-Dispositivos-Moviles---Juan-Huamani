# Práctica 3 – Aplicaciones Básicas Android

Este repositorio contiene el desarrollo de dos ejercicios prácticos utilizando Kotlin y Android Studio.  
Cada ejercicio incluye interfaz gráfica y lógica programada para cumplir con los requisitos planteados.

---

## Ejercicio 1: Interacción con Imágenes

### Descripción
Aplicación que muestra una imagen en pantalla.  
Al hacer clic sobre la imagen, se muestra un Toast con un mensaje personalizado.  
Además, debajo de la imagen se incluye un TextView que sirve como descripción.

### Implementación
- Layout con `ImageView` y `TextView`.
- Evento OnClick en la imagen que despliega un Toast.

### Archivos principales
- `res/drawable/warning.png`
- `res/layout/activity_main.xml`
- `MainActivity.kt`

---

## Ejercicio 2: Reproductor de Música Básico

### Descripción
Aplicación con interfaz sencilla que permite reproducir un archivo de audio local.  
Incluye botones para Reproducir, Pausar y Detener la música.

### Implementación
- Se utiliza la carpeta `res/raw/` para almacenar el archivo de audio (`theenterteiner.mp3`).
- Se usa el objeto MediaPlayer para controlar la reproducción.
- Lógica de los botones:
  - `Reproducir` → Inicia la canción.
  - `Pausar` → Pausa la canción.
  - `Detener` → Detiene la canción y reinicia el reproductor.

### Archivos principales
- `res/raw/theenterteiner.mp3`
- `res/layout/activity_main.xml`
- `MainActivity.kt`

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
- Fecha: 11/09/2025  
