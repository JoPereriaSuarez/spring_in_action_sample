package org.taco_cloud.com.demo.repositories;

import org.taco_cloud.com.demo.domain.entities.Ingredient;


public interface IngredientRepository{

    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient value);
}