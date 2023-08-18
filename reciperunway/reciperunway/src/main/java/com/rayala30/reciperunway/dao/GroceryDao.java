package com.rayala30.reciperunway.dao;

import com.rayala30.reciperunway.model.Grocery;

import java.util.List;

public interface GroceryDao {

    List<Grocery> getGroceries();

    Grocery getGroceryById(int id);

    Grocery createGrocery(Grocery grocery);

    Grocery updateGrocery(Grocery grocery);

    int deleteGroceryById(int id);
}
