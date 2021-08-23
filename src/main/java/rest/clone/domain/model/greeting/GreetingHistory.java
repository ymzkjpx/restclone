package rest.clone.domain.model.greeting;

import java.util.List;

public class GreetingHistory {
    List<Greeting> history;

    public GreetingHistory(List<Greeting> history) {
        this.history = history;
    }

    public List<Greeting> asList() {
        return history;
    }
}
