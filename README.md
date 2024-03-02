# Android - TestFixtures

> [!TIP]
> [AGP versions on Google's Maven repository](https://maven.google.com/web/index.html?q=com.android.tools.build#com.android.tools.build:gradle)  
> [![Gradle 8.3](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Fmaven.google.com%2Fcom%2Fandroid%2Ftools%2Fbuild%2Fgradle%2Fmaven-metadata.xml&label=%20&versionPrefix=8.3)](https://maven.google.com/web/index.html?q=com.android.application#com.android.tools.build:gradle)
> [![Gradle 8.4](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Fmaven.google.com%2Fcom%2Fandroid%2Ftools%2Fbuild%2Fgradle%2Fmaven-metadata.xml&label=%20&versionPrefix=8.4)](https://maven.google.com/web/index.html?q=com.android.application#com.android.tools.build:gradle)

> [!CAUTION]
> ```bash
> ./gradlew build --continue
> ```
> 
> ```
> > Task :android-library:compileDebugUnitTestKotlin FAILED
> e: file:///Android-TestFixtures/android-library/src/test/kotlin/fr/smarquis/android_library/AndroidKotlinLibraryTest.kt:12:23 Unresolved reference: AndroidKotlinLibraryFixtures
> e: file:///Android-TestFixtures/android-library/src/test/kotlin/fr/smarquis/android_library/AndroidKotlinLibraryTest.kt:15:29 Unresolved reference: nextAndroidKotlinLibraryFixture
> 
> > Task :app:compileDebugUnitTestKotlin FAILED
> e: file:///Android-TestFixtures/app/src/test/kotlin/fr/smarquis/testfixtures/AndroidKotlinLibraryTest.kt:3:36 Unresolved reference: AndroidKotlinLibraryFixtures
> e: file:///Android-TestFixtures/app/src/test/kotlin/fr/smarquis/testfixtures/AndroidKotlinLibraryTest.kt:4:36 Unresolved reference: nextAndroidKotlinLibraryFixture
> e: file:///Android-TestFixtures/app/src/test/kotlin/fr/smarquis/testfixtures/AndroidKotlinLibraryTest.kt:14:23 Unresolved reference: AndroidKotlinLibraryFixtures
> e: file:///Android-TestFixtures/app/src/test/kotlin/fr/smarquis/testfixtures/AndroidKotlinLibraryTest.kt:17:29 Unresolved reference: nextAndroidKotlinLibraryFixture
> ```

## Documentation

- [Gradle test fixtures](https://docs.gradle.org/current/userguide/java_testing.html#sec:java_test_fixtures)
- [Android test fixtures](https://developer.android.com/reference/tools/gradle-api/com/android/build/api/dsl/TestFixtures)

## Google's IssueTracker

- [Support Kotlin compilation in AGP](https://issuetracker.google.com/issues/259523353)
- [Support java-test-fixtures plugin](https://issuetracker.google.com/issues/139438142)
