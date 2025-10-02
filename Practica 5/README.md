# Práctica 5 - Configurador de Pedidos de Comida

## Descripción
Esta práctica implementa un flujo completo de pedido de comida en Android utilizando **Fragments** y el componente **Navigation**.  
El usuario comienza en una pantalla inicial, selecciona un tipo de comida, añade extras opcionales y finalmente confirma o edita el pedido en un resumen.

---
## Características principales
- Uso de **Fragments** para dividir el flujo en pantallas independientes.
- Comunicación entre fragments mediante **Bundles**.
- Navegación con **Navigation Component**.
- Resumen del pedido con opción de **confirmar** o **editar**.
- Manejo de estados de checkboxes para extras (bebida, papas, postre).
- Uso de **Toast** al confirmar la acción final.

## Estructura de Fragments
- **InicioFragment**  
  Pantalla inicial de bienvenida que permite comenzar el flujo de pedido.

- **SeleccionComidaFragment**  
  Permite al usuario elegir el tipo de comida principal.

- **SeleccionExtrasFragment**  
  Muestra checkboxes para agregar extras al pedido (bebida, papas, postre).

- **ResumenPedidoFragment**  
  Presenta el resumen del pedido con todos los datos y permite:
  - Confirmar pedido → regresa a la pantalla de inicio.
  - Editar pedido → retorna a la selección de comida con los valores previos cargados.

## Flujo de la app
1. El usuario inicia en la pantalla de **InicioFragment**.  
2. Selecciona una comida principal en **SeleccionComidaFragment**.  
3. Elige los extras opcionales en **SeleccionExtrasFragment**.  
4. Visualiza el resumen de su pedido en **ResumenPedidoFragment**.  
5. Puede **confirmar** el pedido (volver al inicio) o **editarlo** (regresar a selección de comida).

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
6. Probar las funcionalidades.

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
- Fecha: 02/10/2025  

