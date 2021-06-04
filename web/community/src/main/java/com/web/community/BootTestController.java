package com.web.community;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootTestController {
    @GetMapping("/")
    public String hello() {
        return "Hello World!!!";
    }
}