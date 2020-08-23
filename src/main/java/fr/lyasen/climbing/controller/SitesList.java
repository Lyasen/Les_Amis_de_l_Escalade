package fr.lyasen.climbing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SitesList {
    @GetMapping("/sites")
    public ModelAndView sites(Model model) {
        return new ModelAndView( "MainPages/pagesHtml/sites.html");
    }
}
