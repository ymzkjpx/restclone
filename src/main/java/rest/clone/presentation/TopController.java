package rest.clone.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
    @GetMapping
    String top(Model model) {
        return "top";
    }
}
