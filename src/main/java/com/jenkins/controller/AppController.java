package com.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping(value = "/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("My Jenkins App");
    }

    @GetMapping(value = "hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello...");
    }

}
