package rest.clone.application.service.greeting;

import org.springframework.stereotype.Repository;
import rest.clone.domain.model.material.greet.Greeting;

import java.util.List;

@Repository
public interface GreetingRepository {
    Greeting generate(String name);

    void save(Greeting greeting);

    List<Greeting> history();
}
