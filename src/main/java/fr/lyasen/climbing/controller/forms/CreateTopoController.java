package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.model.forms.Form_topo;
import fr.lyasen.climbing.service.forms.CreateTopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateTopoController {
    @Autowired
    CreateTopoService createTopoService;

    @GetMapping("/createTopo")
    public String createTopo(Model model) {
        model.addAttribute("new_topo", new Form_topo());
        return "/Forms/Form/form_topo.html";
    }

    @RequestMapping("/createTopo")
    public String lendingTopo(Model model) {
        Form_topo topo = new Form_topo();
        topo.setLend(true);
        model.addAttribute("is_lend", topo);
        return "is_lend";
    }

    @PostMapping("/createTopo")
    public String submitTopo(@ModelAttribute Form_topo topo) {
        createTopoService.save(topo);
        return "/Forms/Form/form_topo.html";
    }
}