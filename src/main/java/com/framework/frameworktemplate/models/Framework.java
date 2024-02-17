package com.framework.frameworktemplate.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Framework {
    
    @Id
    private Long id;

    private String name;

    
    public Framework(){}

    public Framework(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    
}
