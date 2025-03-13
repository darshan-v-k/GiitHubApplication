package com.giithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Yash {


    @GetMapping("/yash")
    public String yash(){
        return "BOSS !!";
    }
}
