package rest.clone.application.service.greeting;

import org.springframework.stereotype.Repository;
import rest.clone.domain.model.greeting.Greeting;
import rest.clone.domain.model.greeting.GreetingHistory;

@Repository
public interface GreetingRepository {
    Greeting generate(String name);

    void save(Greeting greeting);

    GreetingHistory history();
}
