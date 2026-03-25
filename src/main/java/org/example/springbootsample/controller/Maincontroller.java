package org.example.springbootsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller {

    @GetMapping("/")
    public String sample(){
        return "Applicatio my be any fristmer job +second times or third time changes  +my changes are at 5th times bro "

                +"iam be not noted but 6th changes"+"may more changes applied at all stages";

    }

}
