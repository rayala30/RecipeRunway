package com.rayala30.reciperunway.model;

import org.springframework.data.relational.core.sql.In;

import java.util.List;

public class Grocery extends Ingredient {

    // Instance variables
    int totalQuantity;
    String storeAisle;
    List<Ingredient> ingredientList;
    boolean isAvailable;


    // Constructor
    public Grocery(int foodId, String foodCategory, int quantity, String measure) {
        super(foodId, foodCategory, quantity, measure);
    }

    // Getters

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public String getStoreAisle() {
        return storeAisle;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    // Setters

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public void setStoreAisle(String storeAisle) {
        this.storeAisle = storeAisle;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
