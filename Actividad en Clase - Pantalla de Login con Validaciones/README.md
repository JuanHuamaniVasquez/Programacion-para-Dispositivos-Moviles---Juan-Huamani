# Práctica Guiada – Login con Validaciones en Flutter

Este proyecto es la continuación de la práctica **"Listas dinámicas y CRUD Local con Provider en Flutter"**.  
En esta etapa se agregó una **pantalla de Login** con validaciones y se integró con la pantalla de lista de usuarios.

## ¿Qué se hizo en esta actividad?

- Se creó la pantalla **`LoginScreen`**:
    - Uso de `Form` y `GlobalKey<FormState>`.
    - Validaciones con `validator` para correo y contraseña.
    - Uso de `onSaved` para obtener los valores finales del formulario.
    - Navegación a `UserListScreen` usando `Navigator.push`.
    - Envío del **email** como parámetro al navegar.

- Se modificó **`UserListScreen`**:
    - Ahora recibe un parámetro:
      ```dart
      final String email;
      ```
    - El `AppBar` muestra:
      ```dart
      AppBar(title: Text('Bienvenido: $email'))
      ```

- Se aumento en la interfaz del Login:
    - Botón **“Ingresar”**, botón **“Crear cuenta”** y texto **“¿Olvidaste tu contraseña?”**.
    - Espaciados y paddings más uniformes.

## Requisitos

- Tener instalado:
    - [GitHub Desktop](https://desktop.github.com/)
    - [Android Studio](https://developer.android.com/studio)
    - Flutter/Dart configurado en el entorno (plugin de Flutter en Android Studio).
- Un emulador Android configurado o un dispositivo físico con depuración USB.

## Cómo clonar y ejecutar el proyecto

### 1. Clonar el repositorio con GitHub Desktop

1. Abre **GitHub Desktop**.
2. Haz clic en **File > Clone repository...**.
3. En la pestaña **URL**, pega la URL de tu repositorio de GitHub  
   (por ejemplo: `https://github.com/JuanHuamaniVasquez/Programacion-para-Dispositivos-Moviles---Juan-Huamani.git`).
4. Elige una carpeta local donde guardar el proyecto.
5. Haz clic en **Clone**.

### 2. Abrir el proyecto en Android Studio

1. Abre **Android Studio**.
2. Selecciona **Open** o **Open an Existing Project**.
3. Navega hasta la carpeta donde GitHub Desktop clonó el proyecto y selecciónala.
4. Espera a que Android Studio:
    - Indexe el proyecto.
    - Descargue las dependencias (`flutter pub get` se ejecuta automáticamente, si no, ejecútalo desde la consola de Flutter).

### 3. Ejecutar la app

1. En Android Studio, selecciona un dispositivo:
    - Un emulador Android (AVD).
    - O un celular físico conectado por USB con depuración activada.
2. Asegúrate de que arriba esté seleccionado el dispositivo.
3. Haz clic en el botón **Run**.
4. La app se abrirá mostrando primero la **pantalla de Login**.  
   Al ingresar un correo y contraseña válidos, se navegará a la **lista de usuarios** mostrando  
   `Bienvenido: tu_correo` en el `AppBar`.
