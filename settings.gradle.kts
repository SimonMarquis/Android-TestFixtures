pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        maybeCreate("libs").apply {
            providers.gradleProperty("agp").orNull?.ifEmpty { null }?.let { agp ->
                logger.lifecycle("🚨 Overriding AGP version: $agp")
                version("agp", agp)
            }
        }
    }
}

rootProject.name = "Android-TestFixtures"
include(":app")
include(":android-library")
include(":java-library")
include(":kotlin-library")
