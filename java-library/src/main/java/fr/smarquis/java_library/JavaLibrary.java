package fr.smarquis.java_library;

public final class JavaLibrary {
    private static final JavaLibrary INSTANCE = new JavaLibrary();

    public static JavaLibrary getInstance() {
        return INSTANCE;
    }
}