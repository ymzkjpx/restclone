package rest.clone.presentation.view.model.tutorial;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import rest.clone.domain.model.material.time.RequestDate;

import java.io.IOException;

public class CustomRequestDateSerializer extends JsonSerializer<RequestDate> {
    @Override
    public void serialize(RequestDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.format());
    }
}
