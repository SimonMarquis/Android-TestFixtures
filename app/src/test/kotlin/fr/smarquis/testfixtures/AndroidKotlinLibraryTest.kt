package fr.smarquis.testfixtures

import fr.smarquis.android_library.AndroidKotlinLibraryFixtures
import fr.smarquis.android_library.nextAndroidKotlinLibraryFixture
import org.junit.Test
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertNotNull


class AndroidKotlinLibraryTest {
    @Test
    fun test() {
        assertNotNull(AndroidKotlinLibraryFixtures)
        assertEquals(
            expected = "1",
            actual = Random.nextAndroidKotlinLibraryFixture(1)
        )
    }
}
