package fr.smarquis.testfixtures

import fr.smarquis.kotlin_library.KotlinLibraryFixtures
import fr.smarquis.kotlin_library.nextKotlinLibraryFixture
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