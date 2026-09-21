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

    @GetMapping("/products")
    String products(Model model) {
        List<Product> products = List.of(
                new Product("Notebook", 4.50),
                new Product("Pen", 1.50),
                new Product("Backpack", 29.99)
        );
        model.addAttribute("products", products);
        return "products";
    }
}
