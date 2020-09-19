package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.model.forms.Form_connection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ConnectionController {
    @GetMapping("/connection")
    public String connection(Model model) {
        model.addAttribute("connection", new Form_connection());
        return "Forms/Form/form_connection.html";
    }

    @PostMapping("/connection")
    public String connect(@Valid @ModelAttribute Form_connection connect, Model model) {
        model.addAttribute("main", connect);
        return "redirect:main";
    }
}
