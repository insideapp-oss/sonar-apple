package fr.insideapp.sonarqube.apple.mobsfscan.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public final class MobSFScanReportResultDescriptionDeserializer extends JsonDeserializer<String> {

    public MobSFScanReportResultDescriptionDeserializer() {
        super();
    }

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode tree = codec.readTree(jsonParser);
        return tree.get("description").asText();
    }

}
