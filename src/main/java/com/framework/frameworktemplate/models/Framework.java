package com.framework.frameworktemplate.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Framework {
    
    @Id
    private Long id;

    private String name;

    
}
