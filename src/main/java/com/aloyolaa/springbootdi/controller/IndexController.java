package com.aloyolaa.springbootdi.controller;

import com.aloyolaa.springbootdi.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    //@Qualifier("myService2")
    private IService service;

    @GetMapping({"", "/", "/index"})
    public String index(Model model) {
        model.addAttribute("object", service.operation());
        return "index";
    }

}
