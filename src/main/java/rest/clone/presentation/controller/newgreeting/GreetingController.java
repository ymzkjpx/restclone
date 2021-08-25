package rest.clone.presentation.controller.newgreeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rest.clone.application.service.newgreeting.GreetingService;

@RestController
@RequestMapping("/api/users")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @RequestMapping(value = "by/username/{id}", method = RequestMethod.GET)
    String byUsername(@PathVariable("id") String id){
        return
    }
}
