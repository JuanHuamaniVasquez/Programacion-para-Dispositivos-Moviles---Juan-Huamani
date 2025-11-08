
# Práctica: Navegación Inferior (BottomNavigationBar) en Flutter

## Descripción general
Este proyecto implementa un BottomNavigationBar en Flutter.  
Permite cambiar entre diferentes secciones principales de una aplicación sin recargar la interfaz.

El objetivo principal es comprender la relación entre pantallas, navegación y manejo del estado en Flutter, además de implementar el paso de datos entre pantallas mediante Navigator.push y Navigator.pop.

---

## Objetivos de la práctica
- Implementar una barra de navegación inferior con múltiples pestañas.  
- Comprender el uso de StatefulWidget para controlar el índice seleccionado.  
- Crear una pantalla secundaria (`Editar perfil`) y regresar datos a la pantalla principal.  

---

## Características implementadas
- Cuatro pestañas principales:
  1.  **Inicio**
  2.  **Usuarios**
  3.  **Configuración**
  4.  **Perfil**
- En la pestaña **Perfil**, el usuario puede:
  - Ver su nombre actual.
  - Navegar a una nueva pantalla para **editar su nombre**.
  - Guardar el cambio y ver el nombre actualizado sin reiniciar la app.
- Comunicación entre pantallas usando:
  ```dart
  Navigator.push() // para abrir una nueva pantalla
  Navigator.pop(context, data) // para devolver información

---

##  Requisitos
Tener instalado:

* [Flutter SDK](https://flutter.dev/docs/get-started/install)
* [Android Studio](https://developer.android.com/studio)

---

## Ejecución del proyecto

1. **Clonar con GitHub Desktop**
   - Abre *GitHub Desktop* → **File → Clone repository...**  
   - Pega la URL del repositorio, por ejemplo:  
     ```
     https://github.com/tu_usuario/actividad_bnavigationbar.git
     ```
   - Elige una carpeta local y presiona **Clone**.

2. **Abrir en Android Studio**
   - Abre *Android Studio* → **Open an existing project**  
   - Selecciona la carpeta del proyecto (donde está el archivo `pubspec.yaml`).  
   - Espera a que Flutter sincronice los archivos automáticamente.

3. **Ejecutar la aplicación**
   - Presiona Run en Android Studio
---
## Preguntas de reflexión
1. **¿Por qué usar StatefulWidget?**
   
Porque el índice del tab (_selectedIndex) y el nombre del usuario cambian con las acciones del usuario. Un StatelessWidget no podría actualizar el contenido dinámicamente.

3. **¿Ventajas de separar cada pestaña?**
   
Mejor organización, mantenimiento y legibilidad. Cada pestaña puede tener su propio StatefulWidget con su lógica independiente.

5. **¿Qué cambia con rutas nombradas?**
   
En lugar de Navigator.push(context, MaterialPageRoute(...)), se usaría Navigator.pushNamed(context, '/editar').
Esto facilita la gestión de muchas pantallas en proyectos grandes.

7. **¿Por qué usar Navigator.pop(context, data)?**
   
Permite regresar datos a la pantalla anterior, como el nombre editado en este caso, manteniendo la comunicación entre pantallas.

9. **¿Qué mejoras podrías hacer?**
   * Agregar imagen de perfil.
   * Guardar el nombre con `SharedPreferences`.
   * Usar `BottomNavigationBarType.fixed` o `shifting` con más estilo.
   * Añadir temas claros/oscuros.

---
**Autor:** *Huamani Vásquez Juan José*






Claro 👍 Aquí tienes el bloque en formato **Markdown (.md)**, listo para copiar en tu README:

---

````markdown
## 💭 Preguntas de reflexión

1. **¿Por qué usar StatefulWidget?**  
   Porque el índice del tab (`_selectedIndex`) y el nombre del usuario cambian con las acciones del usuario.  
   Un `StatelessWidget` no podría actualizar el contenido dinámicamente.

2. **¿Ventajas de separar cada pestaña?**  
   Mejor organización, mantenimiento y legibilidad.  
   Cada pestaña puede tener su propio `StatefulWidget` con su lógica independiente.

3. **¿Qué cambia con rutas nombradas?**  
   En lugar de `Navigator.push(context, MaterialPageRoute(...))`, se usaría:  
   ```dart
   Navigator.pushNamed(context, '/editar');
````

Esto facilita la gestión de muchas pantallas en proyectos grandes.

4. **¿Por qué usar `Navigator.pop(context, data)`?**
   Permite regresar datos a la pantalla anterior (como el nombre editado en este caso),
   manteniendo la comunicación entre pantallas.

5. **¿Qué mejoras podrías hacer?**

   * Agregar imagen de perfil.
   * Guardar el nombre con `SharedPreferences`.
   * Añadir temas claros/oscuros.

```

---
```
