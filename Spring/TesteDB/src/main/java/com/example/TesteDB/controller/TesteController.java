package com.example.TesteDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TesteDB.model.Teste;
import com.example.TesteDB.service.TesteService;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    TesteService service;

    @GetMapping("/{meuTeste}")
    private ResponseEntity<String> testando(@PathVariable String meuTeste) {
        return  ResponseEntity.ok(meuTeste);
    }

    @PostMapping("/testerequest") 
        private ResponseEntity<Teste> testerequest(@RequestBody Teste teste) {    
            return ResponseEntity.ok(service.criar(teste));
        }
    
}
