plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.android.kotlin)
}

android {
    namespace = "fr.smarquis.testfixtures"
    compileSdk = 34
    testFixtures.enable = true

    defaultConfig {
        applicationId = namespace
        minSdk = 24
        targetSdk = 34
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

androidComponents {
    beforeVariants(selector().withBuildType("release")) { it.enable = false }
}

dependencies {
    testImplementation(libs.junit)
    testImplementation(kotlin("test"))

    testImplementation(testFixtures(project(":android-library")))
    testImplementation(testFixtures(project(":java-library")))
    testImplementation(testFixtures(project(":kotlin-library")))

    testFixturesRuntimeOnly(libs.stdlib)
}