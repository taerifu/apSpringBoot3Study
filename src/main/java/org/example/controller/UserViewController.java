package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserViewController {

    @GetMapping("/login")
    public String login(){
        System.out.println("login");
        return "login";
    }

    @GetMapping("/signup")
    public String signup(){
        System.out.println("signup");
        return "signup";
    }

    @GetMapping("/loginsuccess")
    public String loginsuccess(){
        System.out.println("loginsuccess");
        return "loginsuccess";
    }

    @GetMapping("/loginerror")
    public String loginerror(){
        System.out.println("loginerror");
        return "loginerror";
    }
}
