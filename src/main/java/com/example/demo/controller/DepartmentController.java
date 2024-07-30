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
import com.example.demo.service.DepartmentService;


@Controller
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping // localhost:8080/department
    public String Index(Model model) {
        List<Department> departments = departmentService.get();
        model.addAttribute("departments", departments);
        return "department/index";
    }

    @GetMapping("form")
    public String form(Model model) {
        model.addAttribute("department", new Department());
        return "department/form";
    }

    @PostMapping("/save")
    public String save(Department department) {
        return departmentService.save(department) ? "redirect:/department" : "form";
    }
    // @GetMapping("/showFormForUpdate/{id}")
    // public String updateForm(@PathVariable(value = "id") long id, Model model) {
    //     Employee employee = employeeServiceImpl.getById(id);
    //     model.addAttribute("employee", employee);
    //     return "update";
    // }
    @GetMapping("form/{id}")
    public String update(@PathVariable(value = "id") Integer id, Model model) {
        Department department = departmentService.get(id);
        model.addAttribute("department", department);
        return "department/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        departmentService.delete(id);
        return "redirect:/department";
    }

    // <td>
    //    <a th:href="@{/department/edit/{id}(id=${department.id})}">Edit</a>
    //    <a th:href="@{/department/delete/{id}(id=${department.id})}" 
    //     onclick="return confirm('Are you sure you want to delete this department?');">Delete</a>
    // </td>
}