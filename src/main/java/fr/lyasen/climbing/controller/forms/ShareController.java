package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.service.forms.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShareController {
    @Autowired
    ShareService shareService;

    @GetMapping("/share")
    public ModelAndView share() {
        ModelAndView model = new ModelAndView ("/Forms/Form/form_share.html");
        return model;
    }
}
