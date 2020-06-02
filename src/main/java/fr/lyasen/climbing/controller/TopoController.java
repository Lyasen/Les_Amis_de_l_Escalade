package fr.lyasen.climbing.controller;

import fr.lyasen.climbing.service.TopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopoController {
    @Autowired
    TopoService topoService;

    @GetMapping("/topo")
    public ModelAndView topo () {
        ModelAndView model = new ModelAndView("MainPages/pagesHtml/topos.html");
        model.addObject("topos", topoService.getTopos());
        return model;
    }
}
