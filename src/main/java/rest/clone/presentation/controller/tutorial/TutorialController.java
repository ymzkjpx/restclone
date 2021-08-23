package rest.clone.presentation.controller.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.clone.application.service.tutorial.TutorialGreetingService;
import rest.clone.domain.model.material.greet.Name;
import rest.clone.domain.model.tutorial.NowGreeting;
import rest.clone.presentation.view.model.tutorial.NowGreetingResponse;

@RestController
@RequestMapping("/api/tutorial")
public class TutorialController {

    @Autowired
    TutorialGreetingService tutorialGreetingService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    NowGreetingResponse tutorialGetMethod(@RequestParam(value = "name", defaultValue = "") @ModelAttribute Name name) {
        return tutorialGreetingService.generateNowGreetingResponse(name.value());
    }

    @RequestMapping(method = RequestMethod.POST)
    public NowGreetingResponse tutorialPostMethod(@RequestBody Name name) {
        return tutorialGreetingService.generateNowGreetingResponse(name.value());
    }
}
