import 'package:flutter/material.dart';
import '../models/user.dart';

class UserViewModel extends ChangeNotifier {
  final List<User> _usuarios = [];
  bool _soloActivos = false;

  bool get soloActivos => _soloActivos;

  List<User> get usuarios => _usuarios;
  List<User> get usuariosFiltrados =>
      _soloActivos ? _usuarios.where((u) => u.activo).toList() : _usuarios;

  void agregarUsuario(User usuario) {
    _usuarios.add(usuario);
    notifyListeners();
  }

  void editarUsuario(int index, User usuario) {
    _usuarios[index] = usuario;
    notifyListeners();
  }

  void eliminarUsuario(int index) {
    _usuarios.removeAt(index);
    notifyListeners();
  }

  void cambiarFiltro(bool valor) {
    _soloActivos = valor;
    notifyListeners();
  }
}