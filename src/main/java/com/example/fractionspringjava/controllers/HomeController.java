package com.example.fractionspringjava.controllers;

import com.example.fractionspringjava.models.Fraction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HomeController {
    @GetMapping("/")
    public String getHomePage(){
        return "home";
    }
    @PostMapping("/home")
    public String postHomePage(Fraction fraction, Model model){
        model.addAttribute("isCorrect",
                fraction.isCorrect()?"is Correct":"is not Correct");
        return "result";
    }
}
