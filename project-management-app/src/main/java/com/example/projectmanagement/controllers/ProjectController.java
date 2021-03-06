package com.example.projectmanagement.controllers;

import com.example.projectmanagement.dao.ProjectRepository;
import com.example.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public String displayProjects(Model model) {
        // return list of employees to /projects
        model.addAttribute("projects", projectRepository.findAll());
        return "projects/list-projects";
    }

    @GetMapping("/new")
    public String displayProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "projects/new-project";
        //return "index";
    }

    @PostMapping("/save")
    public String createProject(Project project, Model model) {
        // save project to db
        projectRepository.save(project);
        return "redirect:/projects/new";
    }
}
