package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.model.forms.Form_shareSite;
import fr.lyasen.climbing.service.forms.ShareSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShareSiteController {
    @Autowired
    ShareSiteService shareSiteService;

    @GetMapping("/share")
    public String share(Model model) {
        model.addAttribute("site", new Form_shareSite());
        return "/Forms/Form/form_share.html";
    }

    @PostMapping("/share")
    public String shareSubmit(@ModelAttribute Form_shareSite site, Model model) {
        shareSiteService.save(site);
        model.addAttribute("site", site);
        return "/Forms/Form/form_share.html";
    }
}
