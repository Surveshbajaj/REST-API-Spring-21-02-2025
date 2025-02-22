package com.bridgelabz.hellofrombridgelabz.controller;

import com.bridgelabz.hellofrombridgelabz.UserDTO;
import org.springframework.web.bind.annotation.*;

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

    //UC-03
    @GetMapping("/param/{name}")
    public String sayHello3(@PathVariable String name){
        return "Hello "+ name + " from BridgeLabz";
    }

    //UC-04
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}
