package rest.clone.presentation.controller.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rest.clone.application.service.greeting.GreetingService;
import rest.clone.domain.model.greeting.GreetingRequest;
import rest.clone.domain.model.material.greet.Greeting;

import java.util.List;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @Autowired
    GreetingService greetingService;


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

    @RequestMapping(value = "history", method = {RequestMethod.GET, RequestMethod.POST})
    List<Greeting> history(){
        List<Greeting> list = greetingService.history();
        return list;
    }
}
