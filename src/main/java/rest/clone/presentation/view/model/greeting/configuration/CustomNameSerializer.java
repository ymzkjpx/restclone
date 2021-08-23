package rest.clone.presentation.view.model.greeting.configuration;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import rest.clone.domain.model.greeting.Name;

import java.io.IOException;

public class CustomNameSerializer extends JsonSerializer<Name> {

    @Override
    public void serialize(Name value,
                          JsonGenerator generator,
                          SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        generator.writeString(value.value());
    }
}
