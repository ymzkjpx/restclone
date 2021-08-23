package rest.clone.application.service.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.clone.domain.model.material.greet.Greeting;
import rest.clone.domain.model.greeting.GreetingRequest;

import java.util.List;

@Service
public class GreetingService {
    @Autowired
    GreetingRepository greetingRepository;


    public Greeting generate(GreetingRequest greetingRequest) {
        return greetingRepository.generate(greetingRequest.name());
    }

    public void recordRequest(Greeting greeting) {
        greetingRepository.save(greeting);
    }

    public List<Greeting> history() {
        return greetingRepository.history();
    }
}
