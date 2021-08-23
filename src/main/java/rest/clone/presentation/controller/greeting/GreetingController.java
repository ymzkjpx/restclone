package rest.clone.presentation.controller.greeting;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rest.clone.application.service.greeting.GreetingService;
import rest.clone.application.service.tutorial.TutorialGreetingService;
import rest.clone.domain.model.material.greet.Greeting;
import rest.clone.domain.model.greeting.GreetingRequest;
import rest.clone.domain.model.material.greet.GreetId;
import rest.clone.domain.model.material.greet.Name;
import rest.clone.domain.model.tutorial.NowGreeting;
import rest.clone.presentation.view.model.tutorial.NowGreetingResponse;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @Autowired
    TutorialGreetingService tutorialGreetingService;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    NowGreetingResponse planeGreeting(@RequestParam(value = "name", defaultValue = "") @ModelAttribute Name name){
        return tutorialGreetingService.generateNowGreetingResponse(name.value());
    }

    @RequestMapping(value = "name", method = RequestMethod.GET)
    String greet(@ModelAttribute GreetingRequest greetingRequest) {
        return "hello";
    }

    @RequestMapping(value = "chiwa", method = RequestMethod.GET)
    Greeting chiwa(@Validated @RequestParam(value = "name", defaultValue = "anonymous") GreetingRequest greetingRequest) {
        Greeting greeting = greetingService.generate(greetingRequest);
        greetingService.recordRequest(greeting);
        return greeting;
    }
}
