package com.framework.frameworktemplate.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Language {
    
    @Id
    private long id;

    private String name;

    Language(){
    }

    Language(String name){
        this.name = name;
    }
    
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
