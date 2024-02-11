package fr.smarquis.java_library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class JavaLibraryTest {

    @Test
    public void test() {
        assertNotNull(JavaLibrary.getInstance());
        assertEquals("1", JavaLibraryFixtures.nextJavaLibraryFixture(1));
    }
}