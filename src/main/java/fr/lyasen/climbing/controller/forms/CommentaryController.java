package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.service.forms.CommentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentaryController {
    @Autowired
    CommentaryService commentaryService;

    @GetMapping("/commentary")
    public ModelAndView commentary() {
        ModelAndView model = new ModelAndView("Forms/Form/form_commentary.html");
        return model;
    }

}
