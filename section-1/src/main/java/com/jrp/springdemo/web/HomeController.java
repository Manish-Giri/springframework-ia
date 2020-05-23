package com.jrp.springdemo.web;

import com.jrp.springdemo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String showHomeForm(Model model) {
        model.addAttribute("userData", new User());
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processHomeForm(User user) {
        return "result";
    }
}
