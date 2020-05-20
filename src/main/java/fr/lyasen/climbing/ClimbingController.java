package fr.lyasen.climbing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClimbingController {
    @GetMapping("/climbing")
    public ModelAndView getEscalade() {

    }
}
