package com.rayala30.reciperunway.model;

public class Ingredient {

    // Instance variables
    int foodId;
    String foodCategory;
    int quantity;
    int weight;
    String measure;
    boolean hasInStock;

    // Constructors

    public Ingredient(int foodId, String foodCategory, int quantity, String measure, int weight) {
        this.foodId = foodId;
        this.foodCategory = foodCategory;
        this.quantity = quantity;
        this.measure = measure;
        this.weight = weight;
    }


    // Getters

    public int getFoodId() {
        return foodId;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isHasInStock() {
        return hasInStock;
    }


    // Setters


    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHasInStock(boolean hasInStock) {
        this.hasInStock = hasInStock;
    }
}
