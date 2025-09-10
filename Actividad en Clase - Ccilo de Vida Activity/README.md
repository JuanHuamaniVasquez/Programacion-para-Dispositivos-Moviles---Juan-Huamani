# Práctica Guiada: Ciclo de Vida de una Activity en Android

## Introducción teórica
En Android, una Activity representa una pantalla con la que el usuario puede interactuar.  
Cada Activity pasa por diferentes etapas llamadas ciclo de vida, las cuales son manejadas por el sistema operativo.  
Comprender el ciclo de vida es esencial para crear aplicaciones eficientes y robustas.

### Principales métodos del ciclo de vida
- **onCreate()**: se ejecuta al crear la Activity. Aquí inicializamos la interfaz.  
- **onStart()**: la Activity es visible para el usuario.  
- **onResume()**: la Activity está activa y lista para usarse.  
- **onPause()**: la Activity está a punto de perder el foco (ej. llega una llamada).  
- **onStop()**: la Activity ya no es visible.  
- **onDestroy()**: la Activity se destruye completamente.  
- **onSaveInstanceState()**: se usa para guardar el estado antes de que la Activity sea destruida.  
- **onRestoreInstanceState()**: se usa para restaurar el estado previamente guardado.  

---

## Objetivos de la práctica
1. Mostrar un contador que aumenta al presionar un botón.  
2. Conservar el contador al rotar la pantalla gracias al ciclo de vida.  
3. Mostrar mensajes en pantalla (Toast) y en consola (Logcat) en cada etapa.  

---

## Paso 1: Videos recomendados
- [Activity y Ciclo de Vida](https://www.youtube.com/watch?v=YDPHFl5LC34)  
- [Ciclo de Vida](https://www.youtube.com/watch?v=3r8ianvCaaM)  
- [onSaveInstanceState, onRestoreInstanceState](https://www.youtube.com/watch?v=QieP0fAvUes)  

---

## Paso 2: Crear el proyecto
Crear un nuevo proyecto en Android Studio llamado **CicloDeVidaApp** con una *Empty Views Activity* y lenguaje **Kotlin**.  

---

## Paso 3: Diseñar la interfaz (`activity_main.xml`)
```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:gravity="center">

    <TextView
        android:id="@+id/textViewContador"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Contador: 0"
        android:textSize="22sp"/>

    <Button
        android:id="@+id/btnAumentar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Aumentar contador"
        android:layout_marginTop="20dp"/>
</LinearLayout>
```

---

## Paso 4: Programar la lógica en MainActivity.kt (Completado)
```kotlin
class MainActivity : AppCompatActivity() {

    private var contador = 0
    private lateinit var textViewContador: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewContador = findViewById(R.id.textViewContador)
        val btnAumentar = findViewById<Button>(R.id.btnAumentar)

        btnAumentar.setOnClickListener {
            contador++
            textViewContador.text = "Contador: $contador"
        }

        Log.d("CICLO", "onCreate llamado")
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show()
    }

    // Completar estos métodos
    override fun onStart() {
        super.onStart()
        Log.d("CICLO", "onStart llamado")
        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("CICLO", "onResume llamado")
        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("CICLO", "onPause llamado")
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("CICLO", "onStop llamado")
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CICLO", "onDestroy llamado")
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("CONTADOR", contador) // Guardar contador
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        contador = savedInstanceState.getInt("CONTADOR") // Recuperar contador
        textViewContador.text = "Contador: $contador"
    }
}

```
## Paso 5: Observar los Logs en Logcat

En Android Studio, abre la pestaña inferior llamada **Logcat**.  
Allí podrás ver los mensajes generados con `Log.d()`, `Log.i()`, `Log.e()`, etc.  
Para esta práctica usamos `Log.d` con la etiqueta **"CICLO"**.

### Cómo aplicar un filtro en Logcat
1. Abre la pestaña **Logcat** en Android Studio.  
2. En la barra de búsqueda, escribe la etiqueta que usaste en el Log (ejemplo: `CICLO`).  
3. Así verás solo los mensajes relacionados con tu práctica.  

---

### Prueba las siguientes acciones y observa Logcat:
- **Abrir la app**: se ejecutan `onCreate`, `onStart`, `onResume`.  
- **Girar la pantalla**: se destruye y vuelve a crear la Activity.  
- **Minimizar la app**: se ejecutan `onPause` y `onStop`.  
- **Cerrar la app**: se ejecuta `onDestroy`.  

---

## Preguntas de reflexión
- ¿Qué sucede si no usamos `onSaveInstanceState`? ¿Por qué se pierde el contador?
  - Si no usamos `onSaveInstanceState` el contador se pierde al girar la pantalla, esto es debido a que cuando la pantalla se gira se destruye la Activity y se crea nuevemante, perdiendo la información del contador en el proceso.
- ¿Por qué Android destruye y vuelve a crear la Activity al rotar la pantalla?
  - Porque es como abrir la aplicación en un entorno nuevo, ya que cambia tanto la orientacion como el tamaño de pantalla visible, por eso debe cambiar la distribucion de elementos correctamente y destruir y volver a crear la Activity es un método eficaz para hacerlo.
- ¿En qué casos prácticos usarías `onPause` y `onStop` en una aplicación real?
  - **onPause**: En un juego, ya que guarda temporalmente el estado de la Activity para poder continuar luego.
  - **onStop**: En una aplicación de banca, ya que se debe cerrar sesión por seguridad.



