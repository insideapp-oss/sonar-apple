package fr.insideapp.sonarqube.apple.commons.result.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTest;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestCase;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ActionTestDeserializer extends JsonDeserializer<List<ActionTest>> {

    public ActionTestDeserializer() {
        super();
    }

    @Override
    public List<ActionTest> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode tree = codec.readTree(jsonParser);
        // get the nested values
        JsonNode values = tree.get("_values");
        Iterator<JsonNode> iterator = values.iterator();
        List tests = new ArrayList<>();
        while (iterator.hasNext()) {
            JsonNode value = iterator.next();
            JsonNode typeName = value.path("_type").path("_name");
            ActionTest.Type type = codec.treeToValue(typeName, ActionTest.Type.class);
            switch (type) {
                case GROUP:
                    tests.add(codec.treeToValue(value, ActionTestGroup.class));
                case METADATA:
                    tests.add(codec.treeToValue(value, ActionTestCase.class));
            }
        }
        return tests;
    }
}
