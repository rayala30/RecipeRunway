package com.rayala30.reciperunway.model;


import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class RecipeCard {

    // Instance variables

    private int recipeId;
    @NotEmpty
    private String recipeImgUrl;
    @NotEmpty
    private String recipeName;
    private String mealType;
    private String dishType;
    private String cuisineType;
    private int servingSize;
    private List<Ingredient> ingredientsList;
    private String instructions;
    private int caloriesPerServing;


    // Getters


    public String getRecipeImgUrl() {
        return recipeImgUrl;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getMealType() {
        return mealType;
    }

    public String getDishType() {
        return dishType;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public int getServingSize() {
        return servingSize;
    }

    public List<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }


    // Setters


    public void setRecipeImgUrl(String recipeImgUrl) {
        this.recipeImgUrl = recipeImgUrl;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setIngredientsList(List<Ingredient> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }
}
