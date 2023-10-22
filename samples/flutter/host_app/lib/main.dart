import 'package:flutter/material.dart';
import 'package:host_app/di/injector.dart';

import 'src/host_app.dart';

void main() {
  WidgetsFlutterBinding.ensureInitialized();

  configureDependencies();

  runApp(const HostApp());
}
