package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Jatin Gupta");
        model.addAttribute("Github", "https://github.com/Jatingupta9120");
        model.addAttribute("LinkedIn", "https://www.linkedin.com/in/jatin-gupta9120/");
        model.addAttribute("youtubeChannel", "jedex99");
        System.out.println("hi i m jatin");
        return "home";
    }

    // About route
    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("isLogin",true);
        System.out.println("About Page Loading ...");
        return "about"; 
    }


    // Service route
    @RequestMapping("/services")
    public String getServices(Model model) {
        System.out.println("Services are running ...");
        return "services";
    }
}
