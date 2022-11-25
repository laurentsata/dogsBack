package com.wild.dogAdopt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wild.dogAdopt.entities.Dog;
import com.wild.dogAdopt.repositories.DogRepository;


//Ajout car on fait avec 2 vsCode
@CrossOrigin("*")
@RestController
@RequestMapping("/dogs") //vu que toutes les routes vont commencer par /dog =>on ajoute cette info
public class DogController {
//on s'injecte le repository ici
    @Autowired
    private DogRepository dogRepository;
    

    //@GetMapping
    //public List<Dog> findAllDogs() {
    //    return this.dogRepository.findAll();
    //}
//On va chercher avec un "GET" tous les chiens avec "findAllDogsByIsAdopted" qu'on a crée dans le repository
    @GetMapping
    public List<Dog> findAllDogsByIsAdopted(Boolean isAdopted) {
        if (isAdopted != null){
            return this.dogRepository.findAllDogsByIsAdopted(isAdopted);
        }
        return this.dogRepository.findAll();
    }

    @GetMapping("/{id}")
    public Dog show(@PathVariable int id){
        return this.dogRepository.findById(id).get();
    }
    
    @PostMapping
    public Dog create(@RequestBody Dog newDog){
        return this.dogRepository.save(newDog);
    }
    
    @PutMapping("/{id}")
    public Dog update(@PathVariable int id, @RequestBody Dog newDog){
        // getting blog
        Dog dogToUpdate = this.dogRepository.findById(id).get();
        dogToUpdate.setName(newDog.getName());
        dogToUpdate.setImgUrl(newDog.getImgUrl());
        dogToUpdate.setSex(newDog.getSex());
        dogToUpdate.setColor(newDog.getColor());
        dogToUpdate.setRace(newDog.getRace());
        dogToUpdate.setIsAdopted(newDog.getIsAdopted());
        return dogRepository.save(dogToUpdate);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id){
        dogRepository.deleteById(id);
        return true;
    }
}

