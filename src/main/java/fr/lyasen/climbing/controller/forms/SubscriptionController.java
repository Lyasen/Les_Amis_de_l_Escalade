package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.model.forms.Form_subscription;
import fr.lyasen.climbing.service.forms.SubscriptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Handle requests for the application subscription form
 */
@Controller
public class SubscriptionController {
    @InitBinder
    public void init(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @Autowired
    SubscriptionService subscriptionService;

    @GetMapping("/subscription")
    public String subscription(Model model) {
        model.addAttribute("subscription", new Form_subscription());
        return "Forms/Form/Form_subscription.html";
    }

    @PostMapping("/subscription")
    public String subscriptionSubmit(@Valid Form_subscription form, BindingResult bResult, Model model) {
        if(bResult.hasErrors()) {
            model.addAttribute("subscription", form);
            return "Forms/Form/Form_subscription.html";
        } else {
            subscriptionService.save(form);
            model.addAttribute("subscription", form);
            return "redirect:main";
        }
    }
}
