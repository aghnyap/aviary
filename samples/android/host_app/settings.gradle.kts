pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
val storageUrl = System.getenv("FLUTTER_STORAGE_BASE_URL") ?: "https://storage.googleapis.com"
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("/Users/aghny/Repositories/org/aghnyap/aviary/container/build/host/outputs/repo")
        }
        maven {
            url = uri("$storageUrl/download.flutter.io")
        }
    }
}

rootProject.name = "HostApp"
include(":app")
include(":counter")
project(":counter").projectDir = File(rootDir, "../counter")
include(":storage")
project(":storage").projectDir = File(rootDir, "../storage")
