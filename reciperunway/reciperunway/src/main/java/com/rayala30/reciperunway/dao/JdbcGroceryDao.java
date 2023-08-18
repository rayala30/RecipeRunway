package com.rayala30.reciperunway.dao;

import com.rayala30.reciperunway.model.Grocery;

import java.util.List;


/**
 *  This JDBC class is used to save generated grocery lists derived from Recipe selections from the RecipeRunway database.
 *  Saved grocery lists can then be retrieved, updated, deleted from the database.
 */


public class JdbcGroceryDao implements GroceryDao {
    @Override
    public List<Grocery> getGroceries() {
        return null;
    }

    @Override
    public Grocery getGroceryById(int id) {
        return null;
    }

    @Override
    public Grocery createGrocery(Grocery grocery) {
        return null;
    }

    @Override
    public Grocery updateGrocery(Grocery grocery) {
        return null;
    }

    @Override
    public int deleteGroceryById(int id) {
        return 0;
    }
}
