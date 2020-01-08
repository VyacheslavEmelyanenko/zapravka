package ru.javabegin.zapravka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1")
public class MesContr {
    @GetMapping
    String home() {
        return "Hello Slava!";
    }
}
