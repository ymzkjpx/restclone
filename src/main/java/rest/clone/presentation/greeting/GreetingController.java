package rest.clone.presentation.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rest.clone.application.service.greeting.GreetingService;
import rest.clone.domain.model.material.greet.Greeting;
import rest.clone.domain.model.greeting.GreetingRequest;
import rest.clone.domain.model.material.greet.GreetId;
import rest.clone.domain.model.material.greet.Name;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping(value = "name", method = RequestMethod.GET)
    String greet(@ModelAttribute GreetingRequest greetingRequest) {
        return "hello";
    }

    @GetMapping("konnichiwa")
    Greeting konnichiwa(@RequestParam(value = "name", defaultValue = "konchiwa~") String name) {
        Greeting greeting = new Greeting(new GreetId(counter.incrementAndGet()), new Name(name));
        return greeting;
    }

    @RequestMapping(value = "chiwa", method = RequestMethod.GET)
    Greeting chiwa(@Validated @RequestParam(value = "name", defaultValue = "anonymous") GreetingRequest greetingRequest) {
        Greeting greeting = greetingService.generate(greetingRequest);
        greetingService.recordRequest(greeting);
        return greeting;
    }
}
