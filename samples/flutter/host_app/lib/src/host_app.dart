import 'package:counter/counter.dart';
import 'package:flutter/material.dart';

import 'ui/theme/theme.dart';

class HostApp extends StatelessWidget {
  const HostApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
        useMaterial3: true,
        colorScheme: lightColorScheme,
      ),
      darkTheme: ThemeData(
        useMaterial3: true,
        colorScheme: darkColorScheme,
      ),
      home: CounterPage(
        title: 'Flutter Demo Home Page',
        onPageClick: () {},
      ),
    );
  }
}
