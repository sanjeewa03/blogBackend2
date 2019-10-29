package com.appedit.base.controllers;

import com.appedit.base.models.User;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        System.out.println("inside base url");
        return "affdssdjhgvjkbvhabpuw hbbsuhbf mhbs";
    }

    @GetMapping("hello")
    public String hello(){
        System.out.println("inside hello function");
        return "inside hello function";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/authenticate")
    public String authenticate(@RequestBody User user){
        System.out.println(user);
        String username= user.getUsername();
        String password = user.getPassword();
        return "reseved";
    }

}
