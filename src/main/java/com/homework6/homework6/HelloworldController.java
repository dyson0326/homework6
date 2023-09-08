package com.homework6.homework6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
