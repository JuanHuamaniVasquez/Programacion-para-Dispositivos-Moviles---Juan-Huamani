import 'package:flutter/material.dart';

class PantallaInicio extends StatelessWidget {
  const PantallaInicio({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Bienvenido')),// Barra superior
      body: Center(
        // Centra los elementos en pantalla
        child: Padding(
          padding: const EdgeInsets.all(20.0),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,// Centra verticalmente
            children: [
              const Text(
                '¡Hola! Bienvenido a mi aplicación personal',
                textAlign: TextAlign.center,
                style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
              ),
              const SizedBox(height: 30),
              ElevatedButton(
                onPressed: () {},// Sin funcionalidad
                child: const Text('Ver mi perfil'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
