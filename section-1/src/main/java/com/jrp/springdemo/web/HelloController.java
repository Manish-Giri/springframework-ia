package com.jrp.springdemo.web;

import org.springframework.web.bind.annotation.*;

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
    public String processForm(@RequestParam(value = "fname") String first, @RequestParam(value = "lname") String last) {
        return "<div style='color:green'><h1>Form Submitted Successfully</h1><p>Name: "
                + first + " " + last + "</p></div>";
    }
    /*
    @RequestMapping("/order_entry")
    public String showOrderForm() {
        return "<h2 style='color:teal'>Order Form</h2>\n" +
                "\n" +
                "<form action=\"/greeting/\" method=\"POST\">\n" +
                "  <label for=\"orderid\">Order: </label><br>\n" +
                "  <input type=\"text\" id=\"orderid\" name=\"oid\"><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";
    }*/

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    public String processOrder(@PathVariable(value = "id") String orderId) {
        return "<div style='color:green'><h1>Order Received Successfully</h1><p>Order ID: "
                + orderId + "</p></div>";
    }


}
