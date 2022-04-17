package fr.insideapp.swift.lang.issues.swiftlint;

import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintRulesDefinition;
import org.junit.Test;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.utils.Version;

import static org.assertj.core.api.Assertions.assertThat;

public class SwiftLintRulesDefinitionTest {

    @Test
    public void define() {

        SonarRuntime sonarRuntime = SonarRuntimeImpl.forSonarQube(Version.create(7, 9),SonarQubeSide.SERVER, SonarEdition.COMMUNITY);
        SwiftLintRulesDefinition rulesDefinition = new SwiftLintRulesDefinition(sonarRuntime);
        RulesDefinition.Context context = new RulesDefinition.Context();
        rulesDefinition.define(context);

        RulesDefinition.Repository dartAnalyzerRepository = context.repository("SwiftLint");
        assertThat(dartAnalyzerRepository).isNotNull();
        assertThat(dartAnalyzerRepository.name()).isEqualTo("SwiftLint");
        assertThat(dartAnalyzerRepository.language()).isEqualTo("swift");
        assertThat(dartAnalyzerRepository.rules()).isNotEmpty();


    }
}
