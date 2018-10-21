package com.bingham.ken.snailshell.controller;

import com.bingham.ken.snailshell.model.Shell;
import com.bingham.ken.snailshell.service.ShellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShellController {

    @Autowired
    private ShellService shellService;

    @GetMapping( value="/shell")
    public Shell getShell(){

        return shellService.getListOfAngles();
    }
}
