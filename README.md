# Android - TestFixtures

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
