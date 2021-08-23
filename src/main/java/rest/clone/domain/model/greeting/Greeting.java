package rest.clone.domain.model.greeting;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import rest.clone.presentation.view.model.greeting.configuration.CustomIdSerializer;

public class Greeting {
    @JsonSerialize(using = CustomIdSerializer.class)
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
