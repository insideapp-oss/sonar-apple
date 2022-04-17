package fr.insideapp.sonarqube.swift.lang.issues;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RepositoryRuleParserTest {

    @Test
    public void parse() throws Throwable {

        RepositoryRuleParser parser = new RepositoryRuleParser();
        ArrayList<RepositoryRule> repositoryRules = parser.parse("/rules/rules.json");
        assertThat(repositoryRules.size()).isEqualTo(2);

        RepositoryRule repositoryRule1 = repositoryRules.get(0);
        assertThat(repositoryRule1.getKey()).isEqualTo("rule1");
        assertThat(repositoryRule1.getName()).isEqualTo("Rule 1");
        assertThat(repositoryRule1.getDescription()).isEqualTo("This is rule 1.");
        assertThat(repositoryRule1.getSeverity()).isEqualTo("MINOR");
        assertThat(repositoryRule1.getDebt()).isNotNull();
        assertThat(repositoryRule1.getDebt().getFunction()).isEqualTo("CONSTANT_ISSUE");
        assertThat(repositoryRule1.getDebt().getOffset()).isEqualTo("5min");

        RepositoryRule repositoryRule2 = repositoryRules.get(1);
        assertThat(repositoryRule2.getKey()).isEqualTo("rule2");
        assertThat(repositoryRule2.getName()).isEqualTo("Rule 2");
        assertThat(repositoryRule2.getDescription()).isEqualTo("This is rule 2.");
        assertThat(repositoryRule2.getSeverity()).isEqualTo("MAJOR");
        assertThat(repositoryRule2.getDebt()).isNotNull();
        assertThat(repositoryRule2.getDebt().getFunction()).isEqualTo("CONSTANT_ISSUE");
        assertThat(repositoryRule2.getDebt().getOffset()).isEqualTo("15min");
    }
}
