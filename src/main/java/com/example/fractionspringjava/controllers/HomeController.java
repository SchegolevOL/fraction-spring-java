package com.example.fractionspringjava.controllers;

import com.example.fractionspringjava.models.Fraction;
import com.example.fractionspringjava.services.FractionService;
import com.example.fractionspringjava.services.FractionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class HomeController {
    FractionService fractionService;

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/task1")
    public String getTask1Page() {
        return "task1";
    }

    @PostMapping("/task1")
    public String postHomePage(Fraction fraction, Model model) {
        model.addAttribute("isCorrect", fractionService.isCorrectFraction(fraction) ? "is Correct" : "is not Correct");
        return "task1";
    }
}
