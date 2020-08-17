package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.model.forms.Form_connection;
import fr.lyasen.climbing.service.forms.CommentaryService;
import fr.lyasen.climbing.service.forms.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConnectionController {
    @Autowired
    ConnectionService connectionService;

    @GetMapping("/connection")
    public String connection(Model model) {
        model.addAttribute("connection", new Form_connection());
        return "Forms/Form/form_connection.html";
    }
}
