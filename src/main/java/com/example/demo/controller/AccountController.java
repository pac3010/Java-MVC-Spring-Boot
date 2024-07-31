package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String user(Model model) {
        List<User> users = userService.get();
        model.addAttribute("users", users);
        return "account/index";
    }

    @GetMapping("password/change/{id}")
    public String form(@PathVariable(value = "id") Integer id, Model model) {
        User user = userService.get(id);
        model.addAttribute("user", user);
        return "account/changePassword";
    }

    @PostMapping("password/change/success")
    public String changePassword(@RequestParam("recentPass") String recentPass,
            @RequestParam("newPass") String newPass,
            @RequestParam("confirmPass") String confirmPass,
            @RequestParam("id") Integer id,
            Model model) {
        User user = userService.get(id);

        if (!user.getPass().equals(recentPass)) {
            return "redirect:/account";
        }

        if (!newPass.equals(confirmPass)) {
            return "redirect:/account";
        }

        user.setPass(newPass);
        userService.save(user);

        return "redirect:/account";
    }

}
