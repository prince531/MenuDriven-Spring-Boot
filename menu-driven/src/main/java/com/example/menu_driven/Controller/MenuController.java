package com.example.menu_driven.Controller;

import com.example.menu_driven.Service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
     MathService mathService;

     public MenuController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/factorial/{num}")
    public Long getFact(@PathVariable int num) {
        return mathService.calculateFact(num);
    }

    @GetMapping("/fibonacci/{num}")
    public Long getFibo(@PathVariable int num){
        return mathService.calculateFibo(num);
    }

    @GetMapping("/palindrome")
    public boolean palindrome(@RequestParam String word) {
        return mathService.isPalindrome(word);
    }
    
}

