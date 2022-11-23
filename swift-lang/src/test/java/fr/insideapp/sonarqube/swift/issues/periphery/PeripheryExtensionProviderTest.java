package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PeripheryExtensionProviderTest {

    private ExtensionProvider provider;

    @Before
    public void prepare() {
        provider = new PeripheryExtensionProvider();
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(8);
    }

}

