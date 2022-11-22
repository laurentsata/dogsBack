package com.wild.dogAdopt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {
    //Dans la table, on met l'id :
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//Integer = wrapper pour avoir ttes les valeurs. Car "int" ne peut pas être nul.
    private Integer id;
    private String name;
    private String imgUrl;
    private String sex;
    private String color;
    private String race;
    private Boolean isAdopted;
    private Integer age;

    public Dog() {
    }


    //Getters car définit en private
    public Integer getId() {
        return id;
    }    

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    public String getRace() {
        return race;
    }
    public Integer getAge() {
        return age;
    }

    public Boolean getIsAdopted() {
        return isAdopted;
    }

    //Setters car définit en private
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
   
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setIsAdopted(Boolean isAdopted) {
        this.isAdopted = isAdopted;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}

