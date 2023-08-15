package com.rayala30.reciperunway.model;

import java.util.List;

public class Recipe {

    // Instance variables
    String mealType;
    String dishType;
    String cuisineType;
    int recipeId;
    int servingSize;
    List<Ingredient> ingredientsList;
    String instructions;
    int caloriesPerServing;

    // Constructors

    public Recipe(String mealType, String dishType, String cuisineType) {
        this.mealType = mealType;
        this.dishType = dishType;
        this.cuisineType = cuisineType;
    }

    public Recipe() {}


    // Getters

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
