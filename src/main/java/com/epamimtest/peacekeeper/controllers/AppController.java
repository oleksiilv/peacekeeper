package com.epamimtest.peacekeeper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    String home(ModelMap modal) {
        modal.addAttribute("title","peacekeeper application");
        return "index";
    }

}