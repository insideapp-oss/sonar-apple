package fr.insideapp.sonarqube.swift.lang;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KeywordsProviderTest {
    @Test
    public void keywordsDetection() throws Throwable {
        KeywordsProvider keywordsProvider = new KeywordsProvider();

        assertThat(keywordsProvider.isKeyword("final")).isTrue();
        assertThat(keywordsProvider.isKeyword("public")).isTrue();
        assertThat(keywordsProvider.isKeyword("class")).isTrue();
        assertThat(keywordsProvider.isKeyword("let")).isTrue();
        assertThat(keywordsProvider.isKeyword("var")).isTrue();
        assertThat(keywordsProvider.isKeyword("protocol")).isTrue();

        assertThat(keywordsProvider.isKeyword("Enum")).isFalse();
        assertThat(keywordsProvider.isKeyword("variable")).isFalse();
        assertThat(keywordsProvider.isKeyword("hello ")).isFalse();
        assertThat(keywordsProvider.isKeyword("Protocol")).isFalse();
        assertThat(keywordsProvider.isKeyword("")).isFalse();
    }
}
