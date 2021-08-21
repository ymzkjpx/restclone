package rest.clone.presentation.greeting;

import org.springframework.web.bind.annotation.*;
import rest.clone.model.Greeting;
import rest.clone.model.GreetingRequest;
import rest.clone.model.Id;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping(value = "name", method = RequestMethod.GET)
    String greet(@ModelAttribute GreetingRequest greetingRequest){
        return "hello";
    }

    @GetMapping("konnichiwa")
    Greeting konnichiwa(@RequestParam(value = "name", defaultValue = "chiwa")String name){
        Greeting greeting = new Greeting(new Id(counter.incrementAndGet()),name);
        return greeting;
    }


}
