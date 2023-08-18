package com.rayala30.reciperunway.dao;

import com.rayala30.reciperunway.model.Recipe;

import java.util.List;


/**
 *  This JDBC class is used to save recipes from the Edamam API into the RecipeRunway database.
 *  Saved recipes can then be retrieved, updated, deleted from the database.
 */

public class JdbcRecipeDao implements RecipeDao {
    @Override
    public List<Recipe> getRecipes() {
        return null;
    }

    @Override
    public Recipe getRecipeById(int id) {
        return null;
    }

    @Override
    public Recipe createRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public Recipe updateRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public int deleteRecipeById(int id) {
        return 0;
    }
}
