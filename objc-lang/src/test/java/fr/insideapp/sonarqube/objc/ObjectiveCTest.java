package fr.insideapp.sonarqube.objc;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.resources.Language;

import static org.assertj.core.api.Assertions.assertThat;

public final class ObjectiveCTest {

    private Language language;

    @Before
    public void prepare() {
        language = new ObjectiveC();
    }

    @Test
    public void definition() {
        assertThat(language.getKey()).isEqualTo("objc");
        assertThat(language.getName()).isEqualTo("Objective-C");
        assertThat(language.getFileSuffixes()).containsOnly("h", "m", "mm");
    }

}
