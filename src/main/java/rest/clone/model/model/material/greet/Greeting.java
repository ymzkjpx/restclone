package rest.clone.model.model.material.greet;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import rest.clone.presentation.configuration.CustomIdentifierSerializer;

public class Greeting {
    @JsonSerialize(using = CustomIdentifierSerializer.class)
    GreetId greetId;
    String name;

    @Deprecated
    Greeting() {}

    public Greeting(GreetId greetId, String name) {
        this.greetId = greetId;
        this.name    = name;
    }

    public GreetId id() {
        return greetId;
    }

    public String name() {
        return name;
    }
}
