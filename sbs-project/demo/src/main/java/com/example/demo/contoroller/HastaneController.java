package com.example.demo.contoroller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hastane")

public class HastaneController {

    @GetMapping("/login")
    public ResponseEntity welcome(){
        return ResponseEntity.ok("Hoş geldiniz");
    }
    @PostMapping("/listele")
    public String hastaneListele(){
        return "hastaneler";

    }
}
