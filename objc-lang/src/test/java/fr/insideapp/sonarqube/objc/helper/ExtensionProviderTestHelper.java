package fr.insideapp.sonarqube.objc.helper;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class ExtensionProviderTestHelper<EP extends ExtensionProvider> {

    protected EP provider;
    private int expectedExtensionCount;

    protected void setup(EP provider, int expectedExtensionCount)  {
        this.provider = provider;
        this.expectedExtensionCount = expectedExtensionCount;
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(expectedExtensionCount);
    }

}
