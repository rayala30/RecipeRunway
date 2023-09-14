package com.rayala30.reciperunway.server.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public class RecipeCard {

    // Instance variables
    private int recipeId;
    @NotEmpty
    @JsonProperty("image")
    private String recipeImgUrl;
    @NotEmpty
    @JsonProperty("label")
    private String recipeName;
    @JsonProperty("ingredients")
    private List<Ingredient> ingredients;
    private String mealType;
    private String dishType;
    private String cuisineType;
    @JsonProperty("yield")
    private int servingSize;
    @JsonProperty("calories")
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

    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    // Methods
    public List<Ingredient> getIngredientsList() {
        return null;
    }
}
