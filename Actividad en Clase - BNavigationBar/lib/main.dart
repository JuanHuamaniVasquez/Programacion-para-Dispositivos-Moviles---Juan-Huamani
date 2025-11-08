import 'package:flutter/material.dart';
// Punto de entrada del programa Flutter.
void main() {
  runApp(const MyApp());
}
// MyApp es el widget principal de la aplicación.
class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _selectedIndex = 0;
  String _nombreUsuario = 'Invitado';
  // Lista de páginas que se muestran según el índice seleccionado.
  // 'late final' permite inicializarla una sola vez, pero después de declarar la variable.
  late final List<Widget> _pages = [
    const Center(child: Text('Inicio', style: TextStyle(fontSize: 24))),
    const Center(child: Text('Usuarios', style: TextStyle(fontSize: 24))),
    const Center(child: Text('Configuración', style: TextStyle(fontSize: 24))),
    _buildPerfilTab(), // La última pestaña es el perfil del usuario.
  ];
  // Metodo que construye dinámicamente el contenido de la pestaña "Perfil".
  // Se usa función aparte para poder reconstruirla cuando cambia el nombre.
  Widget _buildPerfilTab() {
    return Center(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Text('Perfil de $_nombreUsuario', style: const TextStyle(fontSize: 24)),
          const SizedBox(height: 20),
          ElevatedButton(
            // Cuando se presiona, se navega a la pantalla EditarPerfilScreen.
            onPressed: () async {
              // Espera el nombre devuelto desde la otra pantalla.
              final nombre = await Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => const EditarPerfilScreen()),
              );
              // Si el usuario introdujo un nombre y volvió, se actualiza el estado.
              if (nombre != null) {
                setState(() {
                  _nombreUsuario = nombre;
                  _pages[3] = _buildPerfilTab(); // Se reconstruye la pestaña Perfil.
                });
              }
            },
            child: const Text('Editar perfil'),
          ),
        ],
      ),
    );
  }
  // Actualiza el índice cuando el usuario toca una pestaña del BottomNavigationBar.
  void _onItemTapped(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }
  // Metodo principal que define la estructura visual de la pantalla.
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Ejemplo BottomNavigationBar')),
      body: _pages[_selectedIndex],
      // Barra de navegación inferior con 4 pestañas.
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _selectedIndex,
        onTap: _onItemTapped,
        items: const [
          BottomNavigationBarItem(icon: Icon(Icons.home), label: 'Inicio'),
          BottomNavigationBarItem(icon: Icon(Icons.people), label: 'Usuarios'),
          BottomNavigationBarItem(icon: Icon(Icons.settings), label: 'Config'),
          BottomNavigationBarItem(icon: Icon(Icons.person), label: 'Perfil'),
        ],
      ),
    );
  }
}
// Pantalla secundaria que permite editar el nombre del usuario.
class EditarPerfilScreen extends StatefulWidget {
  const EditarPerfilScreen({super.key});

  @override
  State<EditarPerfilScreen> createState() => _EditarPerfilScreenState();
}

class _EditarPerfilScreenState extends State<EditarPerfilScreen> {
  // Controlador para obtener el texto del campo de entrada.
  final TextEditingController _controller = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Editar perfil')),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            // Campo de texto para escribir el nuevo nombre del usuario.
            TextField(
              controller: _controller,
              decoration: const InputDecoration(labelText: 'Nombre'),
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                // Al presionar, se cierra la pantalla y se devuelve el texto introducido.
                Navigator.pop(context, _controller.text);
              },
              child: const Text('Guardar'),
            ),
          ],
        ),
      ),
    );
  }
}

