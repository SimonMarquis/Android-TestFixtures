package fr.smarquis.android_library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AndroidJavaLibraryTest {

    @Test
    public void test() {
        assertNotNull(AndroidJavaLibraryFixtures.getInstance());
        assertEquals("1", AndroidJavaLibraryFixtures.nextAndroidJavaLibraryFixture(1));
    }
}