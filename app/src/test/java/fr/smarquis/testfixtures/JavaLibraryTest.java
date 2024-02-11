package fr.smarquis.testfixtures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import fr.smarquis.java_library.JavaLibrary;
import fr.smarquis.java_library.JavaLibraryFixtures;

public class JavaLibraryTest {

    @Test
    public void test() {
        assertNotNull(JavaLibrary.getInstance());
        assertEquals("1", JavaLibraryFixtures.nextJavaLibraryFixture(1));
    }
}