package org.example.springbootsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller {

    @GetMapping("/")
    public String sample(){
        return "Application is up with vinay  code...";
    }

}
