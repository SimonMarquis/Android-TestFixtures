package fr.smarquis.java_library;

public final class JavaLibraryFixtures {
    private static final JavaLibraryFixtures INSTANCE = new JavaLibraryFixtures();

    public static JavaLibraryFixtures getInstance() {
        return INSTANCE;
    }

    public static String nextJavaLibraryFixture(Integer integer) {
        return integer.toString();
    }
}