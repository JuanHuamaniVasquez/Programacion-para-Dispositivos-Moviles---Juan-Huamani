# RecyclerView con Edición y Long Click

Este proyecto es una práctica guiada de Android que muestra cómo trabajar con **RecyclerView** para administrar una lista de usuarios, permitiendo **agregar, editar y eliminar** elementos de manera interactiva.  

## Funcionalidades
- Mostrar una lista de usuarios en un RecyclerView.  
- Agregar un nuevo usuario a la lista.  
- Eliminar un usuario mediante un botón o un long click.  
- Editar un usuario con un **AlertDialog** y un layout personalizado.  

## Tecnologías
- Kotlin  
- RecyclerView  
- AlertDialog  
- Layouts personalizados (XML)  

## Ejecución

### Usando GitHub Desktop y Android Studio
1. Clonar el repositorio desde GitHub utilizando GitHub Desktop.  
   - Seleccionar **File > Clone Repository** y ubicar el proyecto en la carpeta de trabajo local.
2. Abrir Android Studio y seleccionar **Open Project**.
3. Esperar a que Gradle sincronice las dependencias automáticamente.
4. Conectar un dispositivo físico o abrir un emulador de Android.
5. Ejecutar la aplicación con el botón **Run** en Android Studio.
6. Probar las funcionalidades.
## Preguntas de reflexión

### 1. ¿Qué diferencia hay entre `notifyItemRemoved()`, `notifyItemInserted()` y `notifyItemChanged()`?  
- `notifyItemRemoved(pos)`: Informa al RecyclerView que se eliminó un ítem en la posición `pos`. Se actualiza la lista y se aplican animaciones de remoción.  
- `notifyItemInserted(pos)`: Informa que se agregó un ítem en la posición `pos`. El RecyclerView redibuja la lista y aplica animaciones de inserción.  
- `notifyItemChanged(pos)`: Informa que se modificó el ítem en la posición `pos`. Solo ese elemento se vuelve a dibujar, sin afectar los demás.  

### 2. ¿Por qué es necesario validar `bindingAdapterPosition != RecyclerView.NO_POSITION`?  
Porque durante operaciones rápidas (scroll, eliminación, inserción) la posición de un ViewHolder puede quedar inválida.  
Si no validamos, podríamos intentar editar/eliminar un elemento que ya no existe o está en una posición incorrecta, lo que genera errores.  

### 3. ¿Qué ventajas tiene usar un diálogo frente a abrir una nueva pantalla para editar?  
- Menor complejidad: no requiere crear una nueva Activity o Fragment.  
- Rapidez: permite modificar datos sin cambiar de pantalla.  
- Mejor experiencia de usuario (UX): mantiene el contexto en la misma vista y evita transiciones innecesarias.  
- Más práctico para ediciones simples como nombre, edad o correo.

---

## Autor
- Nombre: Juan José Huamaní Vásquez
- Fecha: 04/10/2025  
