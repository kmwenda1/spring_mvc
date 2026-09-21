package org.store.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.text.AttributedString;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("appName", "My First Spring MVC App");
        return "home";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }
}
