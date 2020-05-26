package com.example.projectmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping("/new")
    public String displayProjectForm() {
        return "new-project";
        //return "index";
    }
}
