package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public String Index(Model model) {
        List<Employee> employees = employeeService.get();
        model.addAttribute("employees", employees);
        return "employee/index";
    }

    @GetMapping("form")
    public String form(Model model) {
        List<Department> departments = departmentService.get();
        model.addAttribute("departments", departments);
        model.addAttribute("employee", new Employee());
        return "employee/form";
    }

    @PostMapping("/save")
    public String save(Employee employee) {
        return employeeService.save(employee) ? "redirect:/employee" : "form";
    }

    @GetMapping("form/{id}")
    public String update(@PathVariable(value = "id") Integer id, Model model) {
        List<Department> departments = departmentService.get(); // Fetch department list
        model.addAttribute("departments", departments);
        Employee employee = employeeService.get(id);
        model.addAttribute("employee", employee);
        return "employee/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        employeeService.delete(id);
        return "redirect:/employee";
    }
}
