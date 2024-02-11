plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-library`
    `java-test-fixtures`
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    testImplementation(libs.junit)
    testImplementation(kotlin("test"))
}
