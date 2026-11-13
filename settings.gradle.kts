pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven("https://maven.aliucord.com/releases")
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.aliucord.gradle") {
                useModule("com.aliucord:gradle:${requested.version}")
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("https://maven.aliucord.com/releases")
    }
}
rootProject.name = "hihah1h4"
include(":plugins:MyFirstKotlinPlugin")
