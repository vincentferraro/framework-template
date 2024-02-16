package com.framework.frameworktemplate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.framework.frameworktemplate.models.Framework;

public interface FrameworkRepository extends CrudRepository<Long,Framework> {
    
}
