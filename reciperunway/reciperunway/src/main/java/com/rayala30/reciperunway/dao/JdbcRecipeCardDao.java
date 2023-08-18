package com.rayala30.reciperunway.dao;

import com.rayala30.reciperunway.model.RecipeCard;

import java.util.List;


/**
 *  This JDBC class is used to save recipes from the Edamam API into the RecipeRunway database.
 *  Saved recipes can then be retrieved, updated, deleted from the database.
 */

public class JdbcRecipeCardDao implements RecipeCardDao {
    @Override
    public List<RecipeCard> getRecipes() {
        return null;
    }

    @Override
    public RecipeCard getRecipeById(int id) {
        return null;
    }

    @Override
    public RecipeCard createRecipe(RecipeCard recipeCard) {
        return null;
    }

    @Override
    public RecipeCard updateRecipe(RecipeCard recipeCard) {
        return null;
    }

    @Override
    public int deleteRecipeById(int id) {
        return 0;
    }
}
