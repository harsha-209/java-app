package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    @GetMapping("/")
    public String helloFriends() {
        return "Hello, friends!";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "App is running";
    }
}
