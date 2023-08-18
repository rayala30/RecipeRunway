package com.rayala30.reciperunway.dao;

import com.rayala30.reciperunway.model.RecipeCard;

import java.util.List;

public interface RecipeCardDao {

    List<RecipeCard> getRecipes();

    RecipeCard getRecipeById(int id);

    RecipeCard createRecipe(RecipeCard recipeCard);

    RecipeCard updateRecipe(RecipeCard recipeCard);

    int deleteRecipeById(int id);

}
