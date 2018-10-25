package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"${allowedUrl}"}, maxAge = 3600)
@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/count")
    public int getNumber(){
        return 2;
    }
}
