package ca.ubishops.gaiterforum.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("appName",appName);
        return  "home";
    }

}
