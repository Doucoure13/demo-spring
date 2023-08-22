package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {
    @GetMapping()
    public ResponseEntity<Object> sendHello(){
        return ResponseEntity.ok("Bonjour, vous allez bien j'espère");
    }
}
