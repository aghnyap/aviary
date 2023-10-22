import 'package:flutter/material.dart';
import 'package:host_app/di/injector.dart';
import 'package:counter/di/injector.dart';

import 'src/host_app.dart';

void main() {
  WidgetsFlutterBinding.ensureInitialized();

  _configureDependencies();

  runApp(const HostApp());
}

Future<void> _configureDependencies() async {
  configureAppDependencies();
  configureCounterDependencies();
}
