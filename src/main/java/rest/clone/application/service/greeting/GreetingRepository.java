package rest.clone.application.service.greeting;

import org.springframework.stereotype.Repository;
import rest.clone.domain.model.material.greet.Greeting;

@Repository
public interface GreetingRepository {
    Greeting generate(String name);

    void save(Greeting greeting);
}
