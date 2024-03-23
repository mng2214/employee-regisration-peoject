package com.emp.controller;

import com.emp.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String registration(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee/register";
    }
}
