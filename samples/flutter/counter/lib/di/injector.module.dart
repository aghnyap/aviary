//@GeneratedMicroModule;CounterPackageModule;package:counter/di/injector.module.dart
// GENERATED CODE - DO NOT MODIFY BY HAND
// ignore_for_file: type=lint
// coverage:ignore-file

// ignore_for_file: no_leading_underscores_for_library_prefixes
import 'dart:async' as _i2;

import 'package:counter/src/cubit/counter_cubit.dart' as _i3;
import 'package:injectable/injectable.dart' as _i1;
import 'package:shared_preferences/shared_preferences.dart' as _i4;

class CounterPackageModule extends _i1.MicroPackageModule {
// initializes the registration of main-scope dependencies inside of GetIt
  @override
  _i2.FutureOr<void> init(_i1.GetItHelper gh) {
    gh.factory<_i3.CounterCubit>(
        () => _i3.CounterCubit(gh<_i4.SharedPreferences>()));
  }
}
