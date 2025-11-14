
# Práctica Guiada: Listas Dinámicas y CRUD Local con Provider en Flutter

Este proyecto implementa una aplicación móvil Flutter que permite **agregar, editar, filtrar y eliminar usuarios**, utilizando el patrón **MVVM** en conjunto con **Provider** para manejar el estado.

---

## Objetivo General

Desarrollar una aplicación Flutter que gestione un CRUD local de usuarios, aplicando el patrón MVVM y Provider como manejador de estado.

---

## Objetivos Específicos

* Aplicar el patrón **MVVM**, separando la UI de la lógica de negocio.
* Implementar **Provider** para manejar el estado de forma eficiente.
* Manejar listas dinámicas con **ListView.builder**.
* Usar componentes interactivos como **RadioButton** y **Switch**.
* Validar formularios y mantener datos consistentes.

---

# Estructura del Proyecto

```
lib/
│
├── main.dart
├── models/
│   └── user.dart
├── viewmodels/
│   └── user_view_model.dart
└── views/
    ├── user_list_screen.dart
    └── user_form_screen.dart
```

---

#  Instalación y Ejecución del Proyecto

A continuación tienes instrucciones tanto para GitHub Desktop como para Android Studio.

---

#  Cómo ejecutar el proyecto con **GitHub Desktop**

### Clonar el repositorio

* Abre **GitHub Desktop**
* Haz clic en **File → Clone Repository**
* Ingresa la URL del repositorio
* Selecciona una carpeta de destino
* Presiona **Clone**

### Abrir el proyecto en un editor

Una vez clonado:

* Ve a *Repository → Open in Visual Studio Code*
  **o**
* *Open in Explorer* → luego abrir con Android Studio

---

# Ejecutar el proyecto con **Android Studio**

### Tener instalado Flutter SDK

Desde Android Studio:
**File → Settings → Plugins**

* Instalar:
   Flutter y Dart

Asegúrate de tener el SDK de Flutter configurado:
**File → Settings → Languages & Frameworks → Flutter**

### Abrir el proyecto

* **File → Open**
* Selecciona la carpeta del proyecto
* Espera a que Android Studio descargue dependencias

### Instalar paquetes

En la terminal integrada:

```
flutter pub get
```

### Ejecutar la app

* Conecta un dispositivo o abre un emulador
* Presiona **Run ▶**
  o desde la terminal:

```
flutter run
```

---

# Dependencias utilizadas

En el archivo `pubspec.yaml` incluye:

```yaml
dependencies:
  flutter:
    sdk: flutter
  provider: ^6.1.5+1
```

Luego ejecutar:

```
flutter pub get
```

---

# Preguntas de Reflexión

### **1. ¿Qué ventajas ofrece usar Provider frente a setState()?**

Provider ofrece una gestión del estado más estructurada y eficiente que setState(), ya que permite actualizar únicamente los widgets que dependen del cambio sin necesidad de reconstruir toda la vista. Además, facilita la separación entre la lógica de negoci
o y la interfaz, mejora la escalabilidad del proyecto, evita duplicar código y soporta arquitecturas modernas como MVVM, lo cual no es práctico ni sostenible utilizando únicamente setState().

---

### **2. ¿Por qué es importante usar ChangeNotifier en el ViewModel?**

El uso de ChangeNotifier en el ViewModel es fundamental porque actúa como el mecanismo que permite notificar a la interfaz cuando ocurre un cambio en los datos. Gracias a esto, los widgets que escuchan al ViewModel pueden actualizarse automáticamente y de forma reactiva. Sin ChangeNotifier, el ViewModel no tendría la capacidad de comunicar cambios a la vista y el flujo de actualización quedaría incompleto, rompiendo el funcionamiento del patrón MVVM.

---

### **3. ¿Qué sucedería si no se llamara a notifyListeners() después de editar un usuario?**

Si no se llamara a notifyListeners() después de editar un usuario, la interfaz no reflejaría ninguna actualización y los cambios realizados serían invisibles para el usuario. Aunque los datos internos del ViewModel habrían cambiado, la UI no recibiría ninguna señal para reconstruirse, generando inconsistencias entre el estado real y lo que se muestra en pantalla. Esto provocaría comportamientos confusos y una experiencia de usuario incorrecta.

---

# Conclusión

En esta práctica se desarrolló una app Flutter aplicando el patrón MVVM y el uso de Provider como manejador de estado. Los estudiantes aprendieron a:

* Crear modelos, ViewModels y vistas organizadas
* Utilizar ChangeNotifier para notificar cambios
* Trabajar con listas dinámicas
* Construir formularios completos y validados
* Mantener la UI sincronizada con los datos

Estos conocimientos son fundamentales para construir aplicaciones móviles modernas y escalables tanto a nivel local como conectado a servicios remotos en futuras prácticas.


---
**Autor:** *Huamani Vásquez Juan José*