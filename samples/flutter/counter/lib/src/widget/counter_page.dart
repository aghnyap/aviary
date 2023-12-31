import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';

import '../../di/injector.dart';
import '../cubit/counter_cubit.dart';

class CounterPage extends StatelessWidget {
  const CounterPage({
    super.key,
    required this.title,
    required this.onPageClick,
  });

  final String title;
  final VoidCallback onPageClick;

  @override
  Widget build(BuildContext context) {
    return BlocProvider(
      create: (context) => getIt<CounterCubit>(),
      child: Builder(builder: (context) {
        return GestureDetector(
          onTap: onPageClick,
          child: Scaffold(
            appBar: AppBar(
              backgroundColor: Theme.of(context).colorScheme.inversePrimary,
              title: Text(title),
            ),
            body: Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  const Text(
                    'You have pushed the button this many times:',
                  ),
                  BlocBuilder<CounterCubit, int>(builder: (context, count) {
                    return Text(
                      '$count',
                      style: Theme.of(context).textTheme.headlineMedium,
                    );
                  }),
                ],
              ),
            ),
            floatingActionButton: FloatingActionButton(
              onPressed: () {
                context.read<CounterCubit>().increment();
              },
              tooltip: 'Increment',
              child: const Icon(Icons.add),
            ),
          ),
        );
      }),
    );
  }
}
