package fr.lyasen.climbing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JargonController {
    @GetMapping("/jargon")
    public ModelAndView jargon() {
        ModelAndView model = new ModelAndView("MainPages/pagesHtml/jargon.html");
        return model;
    }
}
