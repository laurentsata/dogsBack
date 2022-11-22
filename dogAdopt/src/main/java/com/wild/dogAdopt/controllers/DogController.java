package com.wild.dogAdopt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wild.dogAdopt.entities.Dog;
import com.wild.dogAdopt.repositories.DogRepository;


@RestController
@RequestMapping("/dogs") //vu que toutes les routes vont commencer par /dog =>on ajoute cette info
public class DogController {
//on s'injecte le repository ici
    @Autowired
    DogRepository dogRepository;
    
//On va chercher avec un "GET" tous les chiens avec "findAllDogsByIsAdopted" qu'on a crée dans le repository
    @GetMapping
    public List<Dog> findAllDogsByIsAdopted(Boolean isAdopted) {
        return this.dogRepository.findAllDogsByIsAdopted(isAdopted);
    }
    
}

