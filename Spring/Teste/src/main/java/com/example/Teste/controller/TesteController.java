package com.example.Teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TesteController {
    


    @GetMapping("/{palavra}")
    private ResponseEntity<String> helloWorld(@PathVariable String palavra) {
        if (palavra != null) {
            return ResponseEntity.ok(palavra);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        
    }
}
