package com.wild.dogAdopt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wild.dogAdopt.entities.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer>{
    //On crée ici une méthode pour afficher que les chiens adoptés
    //Ca sera dans une List /fichier Dog/la méthode et comment on l'a mise dans entities :
    //Et comme la méthode est définie ici, on peut l'utiliser dans le controller
    public List<Dog> findAllDogsByIsAdopted(Boolean is_adopted);
}

