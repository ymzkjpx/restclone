package rest.clone.application.service.tutorial;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import rest.clone.domain.model.material.greet.Name;
import rest.clone.domain.model.tutorial.NowGreeting;
import rest.clone.presentation.view.model.tutorial.NowGreetingResponse;

@Service
public class TutorialGreetingService {

    public NowGreetingResponse generateNowGreetingResponse(String name) {
        NowGreeting nowGreeting = new NowGreeting(name);
        return new NowGreetingResponse(nowGreeting);
    }
}
