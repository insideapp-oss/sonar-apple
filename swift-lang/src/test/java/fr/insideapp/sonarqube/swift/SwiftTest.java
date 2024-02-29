package fr.insideapp.sonarqube.swift;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.Configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class SwiftTest {

    private Swift swift;
    private Configuration configuration;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        swift = new Swift(configuration);
    }

    @Test
    public void fileSuffixes_default() {
        // prepare
        when(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .thenReturn(new String[]{});
        // test
        final String[] fileSuffixes = swift.getFileSuffixes();
        // prepare
        assertThat(fileSuffixes).containsAll(Swift.FILE_SUFFIXES);
    }

    @Test
    public void fileSuffixes_custom() {
        // prepare
        when(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .thenReturn(new String[]{"foo", "bar"});
        // test
        final String[] fileSuffixes = swift.getFileSuffixes();
        // prepare
        assertThat(fileSuffixes).containsExactlyInAnyOrder("foo", "bar");
    }

    @Test
    public void fileSuffixes_custom_but_not_good() {
        // prepare
        when(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .thenReturn(new String[]{"", "  "});
        // test
        final String[] fileSuffixes = swift.getFileSuffixes();
        // prepare
        assertThat(fileSuffixes).containsAll(Swift.FILE_SUFFIXES);
    }

    @Test
    public void fileSuffixes_custom_with_spaces() {
        // prepare
        when(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .thenReturn(new String[]{"foo  ", "  bar", "", "  "});
        // test
        final String[] fileSuffixes = swift.getFileSuffixes();
        // prepare
        assertThat(fileSuffixes).containsExactlyInAnyOrder("foo", "bar");
    }

}