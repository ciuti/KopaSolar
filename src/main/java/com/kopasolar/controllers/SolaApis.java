package com.kopasolar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kopa")
public class SolaApis {
    @GetMapping(path = "/test")
    public String testApi(){
        return "this is a get request";
    }
}
