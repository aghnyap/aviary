import 'package:flutter/material.dart';

import 'di/injector.dart';
import 'src/host_app.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();

  await configureDependencies();

  runApp(const HostApp());
}
