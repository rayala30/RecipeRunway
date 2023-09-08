package com.rayala30.reciperunway.server.model;

import java.util.List;

public class Grocery extends Ingredient {

    // Instance variables
    private int totalQuantity;
    private String storeAisle;
    private boolean isAvailable;


    // Constructor
    public Grocery(int foodId, String foodCategory, int quantity, String measure, int weight) {
        super(foodId, foodCategory, quantity, measure, weight);
    }

    // Getters
    public int getTotalQuantity() {
        return totalQuantity;
    }
    public String getStoreAisle() {
        return storeAisle;
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
    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    // Methods
    public List<Ingredient> generateGroceryList() {
        return null;
    }
}
