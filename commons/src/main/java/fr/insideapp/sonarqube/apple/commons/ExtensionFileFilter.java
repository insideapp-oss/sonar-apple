package fr.insideapp.sonarqube.apple.commons;

import java.io.File;
import java.io.FileFilter;

public final class ExtensionFileFilter implements FileFilter {

    private final String extension;

    public ExtensionFileFilter(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getPath().toLowerCase().endsWith("." + extension);
    }
}