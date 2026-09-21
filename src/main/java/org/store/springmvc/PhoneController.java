package org.store.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class PhoneController {

    private final PhoneService service;

    PhoneController(PhoneService service) {
        this.service = service;
    }

    @GetMapping("/phones")
    String list(Model model) {
        model.addAttribute("phones", service.findAll());
        return "phones";
    }
}
