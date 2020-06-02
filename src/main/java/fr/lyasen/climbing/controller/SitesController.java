package fr.lyasen.climbing.controller;

import fr.lyasen.climbing.service.SitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SitesController {
    @Autowired
    SitesService sitesService;

    @GetMapping("/sites")
    public ModelAndView sites() {
        ModelAndView model = new ModelAndView("MainPages/pagesHtml/sites.html");
        return model;
    }
}
