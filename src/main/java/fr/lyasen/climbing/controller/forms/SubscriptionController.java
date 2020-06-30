package fr.lyasen.climbing.controller.forms;

import fr.lyasen.climbing.service.forms.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubscriptionController {
    @Autowired
    SubscriptionService subscriptionService;

    @GetMapping("/subscription")
    public ModelAndView subscription() {
        ModelAndView model = new ModelAndView("Forms/Form/form_subscription.html");
        return model;
    }
}
