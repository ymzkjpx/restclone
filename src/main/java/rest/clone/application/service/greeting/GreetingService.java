package rest.clone.application.service.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.clone.domain.model.greeting.Greeting;
import rest.clone.domain.model.greeting.GreetingHistory;
import rest.clone.presentation.view.model.greeting.GreetingRequest;

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

    public GreetingHistory history() {
        return greetingRepository.history();
    }
}
