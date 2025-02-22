package com.bridgelabz.hellofrombridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController1 {
    @GetMapping
    public String sayHello(){
     return "Hello from BridgeLabz";
    }

    //UC-02
    @GetMapping("/query")
    public String sayHello2(@RequestParam String name){
        return "Hello "+ name + " from BridgeLabz";
    }

}
