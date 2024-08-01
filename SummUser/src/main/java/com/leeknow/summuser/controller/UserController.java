package com.leeknow.summuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/1")
    public String get() {
        return "user service";
    }

    @GetMapping("/2")
    public String get2() {
        return "user service";
    }
}
