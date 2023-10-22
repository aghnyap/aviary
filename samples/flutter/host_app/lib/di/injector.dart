import 'package:get_it/get_it.dart';
import 'package:injectable/injectable.dart';

import 'injector.config.dart';

final getIt = GetIt.instance;

@InjectableInit()
void configureAppDependencies() => getIt.init();
