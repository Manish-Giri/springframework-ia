package com.example.projectmanagement.controllers;

import com.example.projectmanagement.dao.EmployeeRepository;
import com.example.projectmanagement.dao.ProjectRepository;
import com.example.projectmanagement.entities.Employee;
import com.example.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    // to get list of projects
    @Autowired
    ProjectRepository projectRepository;

    // to get list of employees
    @Autowired
    EmployeeRepository employeeRepository;

    // to serve app home page
    @GetMapping("/")
    public String displayHome(Model model) {
        List<Project> projectList = projectRepository.findAll();
        model.addAttribute("projectList", projectList);

        List<Employee> employeeList = employeeRepository.findAll();
        model.addAttribute("employeeList", employeeList);
        return "main/home";
    }
}
