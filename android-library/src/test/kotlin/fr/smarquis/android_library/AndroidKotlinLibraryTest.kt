package fr.smarquis.android_library

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
