package fr.insideapp.sonarqube.apple.commons;

import java.util.List;

public interface ExtensionProvider {

    String APPLE_CATEGORY = "Apple";

    List<Object> extensions();

}
