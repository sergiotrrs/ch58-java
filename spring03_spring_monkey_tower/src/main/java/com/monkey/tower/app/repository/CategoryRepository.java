package com.monkey.tower.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monkey.tower.app.model.Category;

public interface CategoryRepository  extends JpaRepository <Category, Long>{

    //TODO: Crear una query que busque la descripción. 
    
    Iterable<Category> findAllByDescriptionContaining(String description);
}