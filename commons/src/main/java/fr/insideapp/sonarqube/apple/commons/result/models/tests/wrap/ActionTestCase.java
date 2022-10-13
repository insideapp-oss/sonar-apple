package fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestMetadata;

import java.util.List;

public class ActionTestCase extends ActionTest {

    public List<ActionTestMetadata> metadata;

    public ActionTestCase(List<ActionTestMetadata> metadata) {
        this.metadata = metadata;
    }

    @Override
    public Type getType() { return Type.METADATA; }

}