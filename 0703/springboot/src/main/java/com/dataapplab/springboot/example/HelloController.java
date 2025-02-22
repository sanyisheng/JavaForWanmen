package com.dataapplab.springboot.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author joshuaz
 * 
 * @GetMapping("/owners/{ownerId}/pets/{petId}")
 * @GetMapping("/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d}{ext:\\.[a-z]+}")
 * @PostMapping(path = "/pets", consumes = "application/json")
 * 
 */

@Controller
@RequestMapping("/first/1")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "<div style='color:red;'>Greetings!</div>";
    }
    
    @GetMapping(value="/{name}/{id}")
    public String greetingPeople(@PathVariable("name") String name,@PathVariable("id") String id, Model model) {
        return "name: "+ name + "code: "+id;
    }
}