package com.rayala30.reciperunway.dao;

import com.rayala30.reciperunway.model.Ingredient;

import java.util.List;

public interface IngredientDao {

    List<Ingredient> getIngredients();

    Ingredient getIngredientById(int id);

    Ingredient createIngredient(Ingredient ingredient);

    Ingredient updateIngredient(Ingredient ingredient);

    int deleteIngredientById(int id);

}
