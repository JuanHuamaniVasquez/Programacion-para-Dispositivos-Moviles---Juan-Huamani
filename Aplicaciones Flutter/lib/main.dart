import 'package:flutter/material.dart';
import 'pantalla_inicio.dart';
import 'pantalla_perfil.dart';
import 'pantalla_hobbies.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Mi App Personal',
      theme: ThemeData(primarySwatch: Colors.teal),
      home: const PantallaPerfil(),
      // Cambia a PantallaPerfil() o PantallaHobbies() para probar
    );
  }
}
