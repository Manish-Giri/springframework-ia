package com.jrp.springdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @RequestMapping("/basic")
    public String sayHello() {
        return "<h1 style='color:teal'>Hello World</h1>";
    }

    @RequestMapping("/user_entry")
    public String showForm() {
        return "<h2 style='color:teal'>HTML Forms</h2>\n" +
                "\n" +
                "<form action=\"/greeting/user_greeting\" method=\"POST\">\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";
    }

    @RequestMapping(value = "/user_greeting", method = RequestMethod.POST)
    public String processForm() {
        return "<h1 style='color:green'>Form Submitted Successfully</h1>";
    }
}
