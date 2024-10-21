package com.example.TesteDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TesteDB.model.Teste;
import com.example.TesteDB.repository.TesteRepo;

@Service
public class TesteService {
    
   @Autowired
    TesteRepo repo;

    public Teste criar(Teste teste) {
        return repo.save(teste);
    } 

}
