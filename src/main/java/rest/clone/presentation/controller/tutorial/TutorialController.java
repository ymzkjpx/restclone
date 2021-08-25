package rest.clone.presentation.controller.tutorial;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rest.clone.application.service.tutorial.TutorialGreetingService;
import rest.clone.presentation.view.error.ErrorType;
import rest.clone.presentation.view.model.tutorial.NameRequest;
import rest.clone.presentation.view.model.tutorial.NowGreetingResponse;

@RestController
@RequestMapping("/api/tutorial")
public class TutorialController {

    @Autowired
    TutorialGreetingService tutorialGreetingService;

    @ApiOperation(value = "API利用のチュートリアル", nickname = "HTTP.Get用", notes = "名前とタイムスタンプのJSONを返す")
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    NowGreetingResponse tutorialGetMethod(@RequestParam(value = "name", defaultValue = "") @ModelAttribute NameRequest name) {
        return tutorialGreetingService.generateNowGreetingResponse(name.value());
    }

    @ApiOperation(value = "API利用のチュートリアル", nickname = "HTTP.Post用", notes = "名前とタイムスタンプのJSONを返す")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public NowGreetingResponse tutorialPostMethod(@RequestBody NameRequest name) {
        return tutorialGreetingService.generateNowGreetingResponse(name.value());
    }
}
