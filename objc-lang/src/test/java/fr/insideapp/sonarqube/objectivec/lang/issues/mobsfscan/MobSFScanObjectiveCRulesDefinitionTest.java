package fr.insideapp.sonarqube.objectivec.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.objc.lang.issues.mobsfscan.MobSFScanObjectiveCRulesDefinition;
import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanObjectiveCRulesDefinitionTest {

    @Test
    public void define() {

        MobSFScanObjectiveCRulesDefinition rulesDefinition = new MobSFScanObjectiveCRulesDefinition();
        RulesDefinition.Context context = new RulesDefinition.Context();
        rulesDefinition.define(context);

        RulesDefinition.Repository repository = context.repository("MobSFScanObjc");
        assertThat(repository).isNotNull();
        assertThat(repository.name()).isEqualTo("MobSFScanObjc");
        assertThat(repository.language()).isEqualTo("objc");
        assertThat(repository.rules()).isNotEmpty();

    }

}
