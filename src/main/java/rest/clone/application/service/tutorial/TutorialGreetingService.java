package rest.clone.application.service.tutorial;

import org.springframework.stereotype.Service;
import rest.clone.domain.model.tutorial.NowGreeting;
import rest.clone.presentation.view.model.tutorial.NowGreetingResponse;

@Service
public class TutorialGreetingService {

    public NowGreetingResponse generateNowGreetingResponse(String name) {
        NowGreeting nowGreeting = new NowGreeting(name);
        return new NowGreetingResponse(nowGreeting);
    }
}
