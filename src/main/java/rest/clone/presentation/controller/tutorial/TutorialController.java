package rest.clone.presentation.controller.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.clone.application.service.tutorial.TutorialGreetingService;
import rest.clone.presentation.view.model.tutorial.NameRequest;
import rest.clone.presentation.view.model.tutorial.NowGreetingResponse;

@RestController
@RequestMapping("/api/tutorial")
public class TutorialController {

    @Autowired
    TutorialGreetingService tutorialGreetingService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    NowGreetingResponse tutorialGetMethod(@RequestParam(value = "name", defaultValue = "") @ModelAttribute NameRequest name) {
        return tutorialGreetingService.generateNowGreetingResponse(name.value());
    }

    @RequestMapping(method = RequestMethod.POST)
    public NowGreetingResponse tutorialPostMethod(@RequestBody NameRequest name) {
        return tutorialGreetingService.generateNowGreetingResponse(name.value());
    }
}
