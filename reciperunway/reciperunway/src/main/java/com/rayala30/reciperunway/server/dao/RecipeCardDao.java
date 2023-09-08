package com.rayala30.reciperunway.server.dao;

import com.rayala30.reciperunway.server.model.RecipeCard;

import java.util.List;

public interface RecipeCardDao {

    List<RecipeCard> getRecipes();

    RecipeCard getRecipeById(int id);

    RecipeCard createRecipe(RecipeCard recipeCard);

    RecipeCard updateRecipe(RecipeCard recipeCard);

    int deleteRecipeById(int id);

}
