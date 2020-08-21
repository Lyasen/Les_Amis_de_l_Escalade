package fr.lyasen.climbing.controller;

import fr.lyasen.climbing.model.forms.Form_shareSite;
import fr.lyasen.climbing.service.SitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("Localization/sites/")
public class SitesController {
    @Autowired
    SitesService service = new SitesService();

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String locationById(@PathVariable ("id") int id, Model model){
        Form_shareSite shareSite = service.getSite(id);
        model.addAttribute("site", shareSite);
        return "Localization/sites/template.html";
    }
}
