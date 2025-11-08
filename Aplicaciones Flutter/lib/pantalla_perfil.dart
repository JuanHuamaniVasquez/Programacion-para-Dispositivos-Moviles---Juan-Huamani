import 'package:flutter/material.dart';

class PantallaPerfil extends StatelessWidget {
  const PantallaPerfil({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Mi Perfil')),
      body: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(20),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.center,
            children: [
              const CircleAvatar(
                radius: 60,
                backgroundImage: NetworkImage('https://images.unsplash.com/photo-1507149833265-60c372daea22')
,
              ),
              const SizedBox(height: 20),
              const Text(
                'Juan José Huamani Vásquez',
                style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
              ),
              const SizedBox(height: 10),
              const Text(
                'Estudiante de Ingeniería de Software • Apasionado por la ciberseguridad',
                textAlign: TextAlign.center,
              ),
              const SizedBox(height: 30),
              const Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Icon(Icons.email, color: Colors.teal),
                  SizedBox(width: 10),
                  Text('jhuamaniv@ulasalle.edu.pe'),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
