package com.example.projectmanagement.controllers;

import com.example.projectmanagement.dao.EmployeeRepository;
import com.example.projectmanagement.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employees/new-employee";
        //return "index";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee, Model model) {
        // save employee object created by form to H2
        employeeRepository.save(employee);

        // redirect to new employee form to prevent duplicate submissions
        return "redirect:/employees/new";
    }
}
