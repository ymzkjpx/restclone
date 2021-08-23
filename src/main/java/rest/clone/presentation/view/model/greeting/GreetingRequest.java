package rest.clone.presentation.view.model.greeting;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.NonNull;

public class GreetingRequest {
    @NonNull String name;

    @Deprecated
    GreetingRequest() {}

    @JsonCreator
    public GreetingRequest(String name) {
        this.name = name;
    }

    public String value() {
        return name;
    }

    public String name() {return name;}

    @Override
    public String toString() {
        return "GreetingRequest{" + "value='" + name + '\'' + '}';
    }
}
