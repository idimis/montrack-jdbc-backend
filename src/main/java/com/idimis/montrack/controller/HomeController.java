package com.idimis.montrack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1 style='color: red; font-weight: bold; font-size: 36px;'>Hello World</h1>";
    }
}
