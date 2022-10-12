package fr.insideapp.sonarqube.apple.commons.result.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

public class FilePathDeserializer extends JsonDeserializer<String> {

    private static String XCODE_TEST_SCHEME = "test://com.apple.xcode/";

    public FilePathDeserializer() {
        super();
    }

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode tree = codec.readTree(jsonParser);
        // get the nested value
        JsonNode value = tree.get("_value");
        String url = codec.treeToValue(value, String.class);
        return StringUtils.removeStart(url, XCODE_TEST_SCHEME);
    }
}

