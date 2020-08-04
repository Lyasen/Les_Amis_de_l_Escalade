package fr.lyasen.climbing.controller;

import fr.lyasen.climbing.service.SitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Localization/sites/")
public class SitesController {
    @Autowired
    SitesService service = new SitesService();

    @RequestMapping(value = "europe/{location}", method = RequestMethod.GET)
    public ModelAndView locationEurope(@PathVariable ("location") String location){
        ModelAndView model = new ModelAndView();
        String HTMLPage = service.getLocations().get(location);
        model.setViewName("Localization/sites/europe/" + HTMLPage);
        return model;
    }

    @RequestMapping(value = "france/{location}", method = RequestMethod.GET)
    public ModelAndView locationFrance(@PathVariable ("location") String location){
        ModelAndView model = new ModelAndView();
        String HTMLPage = service.getLocations().get(location);
        model.setViewName("Localization/sites/france/" + HTMLPage);
        return model;
    }

    @RequestMapping(value = "world/{location}", method = RequestMethod.GET)
    public ModelAndView locationWorld(@PathVariable ("location") String location){
        ModelAndView model = new ModelAndView();
        String HTMLPage = service.getLocations().get(location);
        model.setViewName("Localization/sites/world/" + HTMLPage);
        return model;
    }
}
