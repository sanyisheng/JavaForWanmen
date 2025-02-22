package com.dataapplab.springboot.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dataapplab.springboot.security.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/{name}/{age}")
    public String greeting(
    		@RequestParam(name="name", required=false, defaultValue="World") String name,
    		@RequestParam(name="age",  required=false, defaultValue="20") int age,    		
    		Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody User person) {
        // ...
    }
   
}