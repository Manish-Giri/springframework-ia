package com.example.projectmanagement.controllers;

import com.example.projectmanagement.entities.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping("/new")
    public String displayProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "new-project";
        //return "index";
    }

    @PostMapping("/save")
    public String createProject(Project project, Model model) {
        return "result";
    }
}
