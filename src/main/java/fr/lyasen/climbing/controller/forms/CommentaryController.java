package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.model.forms.Form_commentary;
import fr.lyasen.climbing.service.forms.CommentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentaryController {
    @Autowired
    CommentaryService commentaryService;

    @GetMapping("/commentary")
    public String commentary(Model model) {
        model.addAttribute("commentary", new Form_commentary());
        return "Forms/Form/form_commentary.html";
    }

    @PostMapping("/commentary")
    public String commentarySubmit(@ModelAttribute Form_commentary commentary) {
        commentaryService.save(commentary);
        return "Forms/Form/form_commentary.html";
    }
}
