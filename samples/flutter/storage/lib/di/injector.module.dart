//@GeneratedMicroModule;StoragePackageModule;package:storage/di/injector.module.dart
// GENERATED CODE - DO NOT MODIFY BY HAND
// ignore_for_file: type=lint
// coverage:ignore-file

// ignore_for_file: no_leading_underscores_for_library_prefixes
import 'dart:async' as _i2;

import 'package:injectable/injectable.dart' as _i1;
import 'package:shared_preferences/shared_preferences.dart' as _i3;
import 'package:storage/di/storage_module.dart' as _i4;

class StoragePackageModule extends _i1.MicroPackageModule {
// initializes the registration of main-scope dependencies inside of GetIt
  @override
  _i2.FutureOr<void> init(_i1.GetItHelper gh) async {
    final storageModule = _$StorageModule();
    await gh.factoryAsync<_i3.SharedPreferences>(
      () => storageModule.prefs,
      preResolve: true,
    );
  }
}

class _$StorageModule extends _i4.StorageModule {}