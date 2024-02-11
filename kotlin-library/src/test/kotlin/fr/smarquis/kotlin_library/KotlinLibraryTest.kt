package fr.smarquis.kotlin_library

import org.junit.Test
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class KotlinLibraryTest {
    @Test
    fun test() {
        assertNotNull(KotlinLibraryFixtures)
        assertEquals(
            expected = "1",
            actual = Random.nextKotlinLibraryFixture(1)
        )
    }
}