package rest.clone.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import rest.clone.presentation.configuration.CustomIdentifierSerializer;

public class Greeting {
    @JsonSerialize(using = CustomIdentifierSerializer.class)
    Id id;
    String name;

    @Deprecated
    Greeting() {}

    public Greeting(Id id, String name) {
        this.id = id;
        this.name = name;
    }

    public Id id() {
        return id;
    }

    public String name() {
        return name;
    }
}
