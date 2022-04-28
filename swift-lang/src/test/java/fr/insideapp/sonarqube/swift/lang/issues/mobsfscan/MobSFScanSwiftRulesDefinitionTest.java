package fr.insideapp.sonarqube.swift.lang.issues.mobsfscan;

import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanSwiftRulesDefinitionTest {

    @Test
    public void define() {

        MobSFScanSwiftRulesDefinition rulesDefinition = new MobSFScanSwiftRulesDefinition();
        RulesDefinition.Context context = new RulesDefinition.Context();
        rulesDefinition.define(context);

        RulesDefinition.Repository repository = context.repository("MobSFScanSwift");
        assertThat(repository).isNotNull();
        assertThat(repository.name()).isEqualTo("MobSFScanSwift");
        assertThat(repository.language()).isEqualTo("swift");
        assertThat(repository.rules()).isNotEmpty();

    }

}
