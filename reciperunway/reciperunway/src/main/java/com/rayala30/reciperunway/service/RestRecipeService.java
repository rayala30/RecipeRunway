package com.rayala30.reciperunway.service;

import com.rayala30.reciperunway.model.Recipe;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * This class will communicate with the Edamam API and handle recipe GET requests to create
 * Recipe objects.
 *
 */

@Component
public class RestRecipeService implements RecipeService {

    public static String API_BASE_URL = "";

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public Recipe getRecipe() {
        return restTemplate.getForObject(API_BASE_URL, Recipe.class);
    }
}
