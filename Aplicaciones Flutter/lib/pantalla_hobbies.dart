import 'package:flutter/material.dart';

class PantallaHobbies extends StatelessWidget {
  const PantallaHobbies({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Mis Hobbies')),// Barra superior
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,// Alinea texto a la izquierda
          children: [
            const Text(
              'Actividades que disfruto:',
              style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 20),
            Row(
              children: const [
                Icon(Icons.piano, color: Colors.teal),
                SizedBox(width: 10),
                Text('Tocar en el piano mis canciones favoritas'),
              ],
            ),
            const SizedBox(height: 15),
            Row(
              children: const [
                Icon(Icons.sports_esports, color: Colors.teal),
                SizedBox(width: 10),
                Text('Jugar videojuegos con amigos'),
              ],
            ),
            const SizedBox(height: 15),
            Row(
              children: const [
                Icon(Icons.music_video, color: Colors.teal),
                SizedBox(width: 10),
                Text('Escuchar música durante caminatas largas'),
              ],
            ),
            const SizedBox(height: 15),
            Row(
              children: const [
                Icon(Icons.music_note, color: Colors.teal),
                SizedBox(width: 10),
                Text('Aprender a tocar la guitarra'),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
