package rest.clone.domain.model.material.greet;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import rest.clone.presentation.configuration.CustomIdentifierSerializer;

public class Greeting {
    @JsonSerialize(using = CustomIdentifierSerializer.class)
    GreetId greetId;
    Name name;

    @Deprecated
    Greeting() {}

    public Greeting(GreetId greetId, Name name) {
        this.greetId = greetId;
        this.name    = name;
    }

    public GreetId id() {
        return greetId;
    }

    public Name name() {
        return name;
    }
}
