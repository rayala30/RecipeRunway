package com.rayala30.reciperunway.dao;

import com.rayala30.reciperunway.model.Ingredient;

import java.util.List;


/**
 *  This JDBC class is used to save ingredients parsed from the currently saved recipes in the RecipeRunway database.
 *  Saved ingredients can then be retrieved, updated, deleted from the database.
 */

public class JdbcIngredientDao implements IngredientDao {
    @Override
    public List<Ingredient> getIngredients() {
        return null;
    }

    @Override
    public Ingredient getIngredientById(int id) {
        return null;
    }

    @Override
    public Ingredient createIngredient(Ingredient ingredient) {
        return null;
    }

    @Override
    public Ingredient updateIngredient(Ingredient ingredient) {
        return null;
    }

    @Override
    public int deleteIngredientById(int id) {
        return 0;
    }
}
