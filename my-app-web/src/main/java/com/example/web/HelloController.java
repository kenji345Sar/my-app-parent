package com.example.web;

import com.example.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Greeting hello() {
        return new Greeting("こんにちは、Spring Boot + マルチモジュール from WSL!");
    }
}
