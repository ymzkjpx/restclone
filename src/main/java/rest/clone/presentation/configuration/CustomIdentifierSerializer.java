package rest.clone.presentation.configuration;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import rest.clone.model.Id;

import java.io.IOException;

public class CustomIdentifierSerializer extends JsonSerializer<Id> {

    @Override
    public void serialize(
            Id value,
            JsonGenerator generator,
            SerializerProvider serializerProvider
                         ) throws IOException, JsonProcessingException{
        generator.writeString(value.format());
    }
}
