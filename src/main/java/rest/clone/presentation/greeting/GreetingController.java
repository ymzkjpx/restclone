package rest.clone.presentation.greeting;

import org.springframework.web.bind.annotation.*;
import rest.clone.model.Greeting;
import rest.clone.model.GreetingRequest;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

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
        Greeting greeting = new Greeting(counter.incrementAndGet(),name);
        return greeting;
    }


}
