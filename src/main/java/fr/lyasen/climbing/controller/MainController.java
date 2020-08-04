package fr.lyasen.climbing.controller;

import fr.lyasen.climbing.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    MainService mainService;

    @GetMapping("/main")
    public ModelAndView main() {
        return new ModelAndView("MainPages/pagesHtml/main.html");
    }
}
