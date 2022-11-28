package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.swift.issues.swiftlint.SwiftLintExtensionProvider;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MobSFScanExtensionProviderTest {

    private MobSFScanExtensionProvider provider;

    @Before
    public void prepare() {
        provider = new MobSFScanExtensionProvider();
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(7);
    }

}
