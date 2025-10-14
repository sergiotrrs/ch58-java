package com.monkey.tower.app.util;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.*;
import org.springframework.stereotype.*;

import com.monkey.tower.app.model.Category;
import com.monkey.tower.app.repository.CategoryRepository;

@Component
@Order(2)
@Profile("devH2")
public class CategoryDataLoader implements CommandLineRunner{
    
    private static final Logger log = LoggerFactory.getLogger(CategoryDataLoader.class);
    private final CategoryRepository categoryRepository;
    
    public CategoryDataLoader(CategoryRepository categoryRepository) {
        super();
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // 
        log.info("=== Ejecucion de CategoryLoader === ");
        
        // ======== CREATE ===========
        categoryRepository.save(new Category(1L, "Deportes", "Calistenia, Escalado, Futbol" ));
        categoryRepository.save(new Category(2L, "Cocina", "Vajilla, Cubiertos, electrodomesticos" ));
        categoryRepository.save(new Category(3L, "Muebles", "Madera o Metales varios" ));
        categoryRepository.save(new Category(4L, "Farmacia", "Todo lo relacionado a Medicina." ));
        
        // ========= Obtener todos los roles =============
        Iterable <Category> categories = categoryRepository.findAll();
        for (Category category: categories) { 
            log.info("Category Description: " + category);
        }
        // ===== Encontrar un role un role ==========

        Optional<Category> optionalCategory = categoryRepository.findById(4L);
        
        if (optionalCategory.isPresent()) {
            // ------------------- READ ----------------
            Category existingCategory = optionalCategory.get();
            log.info("Categoría encontrada: " + existingCategory);
            // ------------ UPDATE ----------------
            existingCategory.setDescription("Descripción modificada");
            categoryRepository.save(existingCategory);
        } else { 
            log.warn("La categoría no fue encontrada");
        }
        
        categories = categoryRepository.findAll();
        for (Category category: categories) { 
            log.info("Category Description: " + category);
        }
        
        // ========== DELETE ============
        boolean existingCategory = categoryRepository.existsById(3L);
        if (existingCategory) { 
            log.info("Categoria encontrada y eliminada: ");
            categoryRepository.deleteById(3L);
            
        }
        categories = categoryRepository.findAll();
        for (Category category: categories) { 
            log.info("Categoría Description: " + category);
        }
        // Uso de Query methods 
        categories = categoryRepository.findAllByDescriptionContaining("ado");
        for (Category category: categories) { 
            log.info("Categoria relacionado con ADO: " + category);
        }            
        
    }
    
}
