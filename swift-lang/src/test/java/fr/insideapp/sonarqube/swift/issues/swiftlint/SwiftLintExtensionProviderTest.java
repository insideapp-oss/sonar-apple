package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SwiftLintExtensionProviderTest {

    private ExtensionProvider provider;

    @Before
    public void prepare() {
        provider = new SwiftLintExtensionProvider();
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(5);
    }

}

