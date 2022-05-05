package fr.insideapp.sonarqube.swift.lang.issues.periphery;

import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public class PeripheryRulesDefinitionTest {

    @Test
    public void define() {

        PeripheryRulesDefinition rulesDefinition = new PeripheryRulesDefinition();
        RulesDefinition.Context context = new RulesDefinition.Context();
        rulesDefinition.define(context);

        RulesDefinition.Repository repository = context.repository("Periphery");
        assertThat(repository).isNotNull();
        assertThat(repository.name()).isEqualTo("Periphery");
        assertThat(repository.language()).isEqualTo("swift");
        assertThat(repository.rules()).isNotEmpty();


    }
}
