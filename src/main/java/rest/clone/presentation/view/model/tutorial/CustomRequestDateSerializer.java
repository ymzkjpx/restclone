package rest.clone.presentation.view.model.tutorial;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import rest.clone.domain.model.material.time.RequestDateTime;

import java.io.IOException;

public class CustomRequestDateSerializer extends JsonSerializer<RequestDateTime> {
    @Override
    public void serialize(RequestDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.format());
    }
}
