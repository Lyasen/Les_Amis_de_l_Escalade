package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.service.forms.FTopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FTopoController {
    @Autowired
    FTopoService fTopoService;

    @GetMapping("/ftopo")
    public ModelAndView ftopo() {
        ModelAndView model = new ModelAndView("/Forms/Form/form_topo.html");
        return model;
    }
}
