package com.framework.frameworktemplate.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Language {
    
    @Id
    private long id;

    private String name;

    


}
