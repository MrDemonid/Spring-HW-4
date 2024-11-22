package mr.demonid.spring.hw4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping
    String redirectToMain() {
        return "redirect:/users";
    }
}
