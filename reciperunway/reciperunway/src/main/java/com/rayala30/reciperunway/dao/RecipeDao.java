package com.rayala30.reciperunway.dao;

import com.rayala30.reciperunway.model.Recipe;

import java.util.List;

public interface RecipeDao {

    List<Recipe> getRecipes();

    Recipe getRecipeById(int id);

    Recipe createRecipe(Recipe recipe);

    Recipe updateRecipe(Recipe recipe);

    int deleteRecipeById(int id);

}
