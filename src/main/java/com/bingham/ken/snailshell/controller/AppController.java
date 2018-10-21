package com.bingham.ken.snailshell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String getIndex(){

        return "index.html";
    }
}
