package fr.smarquis.testfixtures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import fr.smarquis.android_library.AndroidJavaLibraryFixtures;

public class AndroidJavaLibraryTest {

    @Test
    public void test() {
        assertNotNull(AndroidJavaLibraryFixtures.getInstance());
        assertEquals("1", AndroidJavaLibraryFixtures.nextAndroidJavaLibraryFixture(1));
    }
}