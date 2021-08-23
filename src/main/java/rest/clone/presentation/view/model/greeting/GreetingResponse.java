package rest.clone.presentation.view.model.greeting;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import rest.clone.domain.model.greeting.GreetId;
import rest.clone.domain.model.greeting.Greeting;
import rest.clone.domain.model.greeting.Name;
import rest.clone.presentation.view.model.greeting.configuration.CustomIdSerializer;
import rest.clone.presentation.view.model.greeting.configuration.CustomNameSerializer;

public class GreetingResponse {
    @JsonSerialize(using = CustomIdSerializer.class)
    GreetId id;

    @JsonSerialize(using = CustomNameSerializer.class)
    Name name;

    @Deprecated
    GreetingResponse() {}

    public GreetingResponse(Greeting greeting) {
        this.id   = greeting.id();
        this.name = greeting.name();
    }

    public GreetId id() {
        return id;
    }

    public Name name() {
        return name;
    }

    @Override
    public String toString() {
        return "GreetingResponse{" + "id=" + id + ", name=" + name + '}';
    }
}
