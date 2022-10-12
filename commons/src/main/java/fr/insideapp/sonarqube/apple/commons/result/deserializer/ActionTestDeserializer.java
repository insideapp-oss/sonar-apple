package fr.insideapp.sonarqube.apple.commons.result.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.*;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTest;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestCase;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ActionTestDeserializer extends JsonDeserializer<ActionTest> {

    public ActionTestDeserializer() {
        super();
    }

    @Override
    public ActionTest deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode tree = codec.readTree(jsonParser);
        // get the nested values
        JsonNode values = tree.get("_values");
        Iterator<JsonNode> iterator = values.iterator();
        // we keep two separate lists
        ArrayList<ActionTestSummaryGroup> groups = new ArrayList<>();
        ArrayList<ActionTestMetadata> metadata = new ArrayList<>();
        while (iterator.hasNext()) {
            JsonNode value = iterator.next();
            JsonNode typeName = value.path("_type").path("_name");
            ActionTest.Type type = codec.treeToValue(typeName, ActionTest.Type.class);
            switch (type) {
                case GROUP:
                    groups.add(codec.treeToValue(value, ActionTestSummaryGroup.class));
                case METADATA:
                    metadata.add(codec.treeToValue(value, ActionTestMetadata.class));
            }
        }
        if (!groups.isEmpty()) {
            return new ActionTestGroup(groups);
        } else {
            return new ActionTestCase(metadata);
        }
    }
}
