import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:injectable/injectable.dart';
import 'package:shared_preferences/shared_preferences.dart';

@injectable
class CounterCubit extends Cubit<int> {
  CounterCubit(this.sharedPreferences)
      : super(sharedPreferences.getInt("count") ?? 0);

  final SharedPreferences sharedPreferences;

  void increment() {
    emit(state + 1);
    sharedPreferences.setInt("count", state);
  }
}
