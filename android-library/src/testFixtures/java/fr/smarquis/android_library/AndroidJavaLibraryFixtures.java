package fr.smarquis.android_library;

public final class AndroidJavaLibraryFixtures {
    private static final AndroidJavaLibraryFixtures INSTANCE = new AndroidJavaLibraryFixtures();

    public static AndroidJavaLibraryFixtures getInstance() {
        return INSTANCE;
    }

    public static String nextAndroidJavaLibraryFixture(Integer integer) {
        return integer.toString();
    }
}