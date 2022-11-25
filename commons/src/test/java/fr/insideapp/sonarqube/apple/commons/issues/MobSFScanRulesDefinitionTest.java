package fr.insideapp.sonarqube.apple.commons.issues;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.resources.AbstractLanguage;
import org.sonar.api.server.rule.RulesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public final class MobSFScanRulesDefinitionTest {

    private MobSFScanRulesDefinition rulesDefinition;
    private RulesDefinition.Context context;

    @Before
    public void prepare() {
        rulesDefinition = new MobSFScanRulesDefinition(new AbstractLanguage("lang") {
            @Override
            public String[] getFileSuffixes() {
                return new String[]{};
            }
        }) {};
        context = new RulesDefinition.Context();
    }

    @Test
    public void define() {
        // test
        rulesDefinition.define(context);
        // assert
        RulesDefinition.Repository repository = context.repository("MobSFScanLang");
        assertThat(repository).isNotNull();
        assertThat(repository.key()).isEqualTo("MobSFScanLang");
        assertThat(repository.name()).isEqualTo("MobSFScanLang");
        assertThat(repository.language()).isEqualTo("lang");
        assertThat(repository.rules()).hasSize(2);
    }
}
