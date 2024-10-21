package com.example.TesteDB.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.TesteDB.model.Teste;

@Repository
public interface TesteRepo extends CrudRepository<Teste, Integer> {
    
}
