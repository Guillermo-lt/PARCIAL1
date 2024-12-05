package com.example.sesion4.controller;

import com.example.sesion4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showLoginForm() {
        return "form";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute User user, Model model) {
        if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
            return "success";
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "form";
        }
    }
}
