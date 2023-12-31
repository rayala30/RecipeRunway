package com.rayala30.reciperunway.server.controller;


import com.rayala30.reciperunway.server.dao.RecipeCardDao;
import com.rayala30.reciperunway.server.model.RecipeCard;
import com.rayala30.reciperunway.server.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *  This controller will communicate with the localhost API and the front-end portion of the application.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/v1/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private RecipeCardDao recipeCardDao;

    @GetMapping
    public List<RecipeCard> list() {
        return recipeCardDao.getRecipes();
    }

    @GetMapping
    public RecipeCard getRecipeCardById(@PathVariable int id) {
        return recipeCardDao.getRecipeById(id);
    }



}
