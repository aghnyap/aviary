import 'package:counter/di/injector.module.dart';
import 'package:get_it/get_it.dart';
import 'package:injectable/injectable.dart';
import 'package:storage/di/injector.module.dart';

import 'injector.config.dart';

final getIt = GetIt.instance;

@InjectableInit(
  externalPackageModulesBefore: [
    ExternalModule(StoragePackageModule),
    ExternalModule(CounterPackageModule),
  ],
)
void configureDependencies() => getIt.init();
