package fr.insideapp.sonarqube.apple.commons.result.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;

import java.io.IOException;

public class ValueDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer {

    private Class<?> clazz;

    public ValueDeserializer(Class<?> clazz) {
        this.clazz = clazz;
    }

    public ValueDeserializer() {
        super();
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JavaType type = deserializationContext.getContextualType();
        return new ValueDeserializer(type.getRawClass());
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode tree = codec.readTree(jsonParser);
        // get the nested value
        JsonNode value = tree.get("_value");
        return codec.treeToValue(value, clazz);
    }
}

