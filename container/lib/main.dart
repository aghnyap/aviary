import 'package:flutter/material.dart';

import 'di/injector.dart';
import 'src/container_app.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();

  await configureDependencies();

  runApp(const ContainerApp());
}
