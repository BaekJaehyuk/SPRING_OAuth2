package com.example.Spring_OAuth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyController {

    @GetMapping("/my")
    public String myAPI() {
        return "My HOME";
    }
}
