package fr.insideapp.sonarqube.swift.issues.warnings;

import fr.insideapp.sonarqube.apple.commons.rules.JSONRulesDefinition;
import fr.insideapp.sonarqube.swift.Swift;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public class XcodeWarningSwiftRulesDefinitionTest {

    private JSONRulesDefinition rulesDefinition;
    private Swift language;
    private RulesDefinition.Context context;

    @Before
    public void prepare() {
        language = new Swift();
        rulesDefinition = new XcodeWarningSwiftRulesDefinition(language);
        context = new RulesDefinition.Context();
    }

    @Test
    public void define() {
        // test
        rulesDefinition.define(context);
        // assert
        RulesDefinition.Repository repository = context.repository("XcodeWarningSwift");
        assertThat(repository).isNotNull();
        assertThat(repository.name()).isEqualTo("XcodeWarningSwift");
        assertThat(repository.language()).isEqualTo(language.getKey());
        assertThat(repository.rules()).hasSize(2);
    }
}
