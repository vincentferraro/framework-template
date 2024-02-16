package com.framework.frameworktemplate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.framework.frameworktemplate.models.Language;

public interface LanguageRepository extends CrudRepository<Long,Language> {
    
}
