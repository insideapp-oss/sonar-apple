package fr.insideapp.sonarqube.apple.commons.result.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ValuesDeserializer extends JsonDeserializer<ArrayList<?>> implements ContextualDeserializer {

    private Class<?> clazz;

    public ValuesDeserializer(Class<?> clazz) {
        this.clazz = clazz;
    }

    public ValuesDeserializer() { super(); }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JavaType type = beanProperty.getType();
        JavaType valueType = type.containedType(0);
        return new ValuesDeserializer(valueType.getRawClass());
    }

    @Override
    public ArrayList<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode tree = codec.readTree(jsonParser);
        // get the nested values
        JsonNode values = tree.get("_values");
        Iterator<JsonNode> iterator = values.iterator();
        ArrayList records = new ArrayList<>();
        while (iterator.hasNext()) {
            JsonNode value = iterator.next();
            records.add(codec.treeToValue(value, clazz));
        }
        return records;
    }
}
