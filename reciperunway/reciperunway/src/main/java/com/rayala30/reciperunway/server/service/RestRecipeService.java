package com.rayala30.reciperunway.server.service;

import com.rayala30.reciperunway.server.model.RecipeCard;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * This class will communicate with the Edamam API and handle recipe GET requests to create
 * Recipe objects.
 *
 */

@Component
public class RestRecipeService implements RecipeService {


    @Value("${edamam.service.id}")
    private String apiId;

    @Value("${edamam.service.key}")
    private String apiKey;

    // API ID and Key required to access API. Variables stored in .yml file
    public String API_BASE_URL = "https://api.edamam.com/api/recipes/v2?app_id=" + apiId + "&app_key=" + apiKey;



    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public RecipeCard getRecipe() {
        return restTemplate.getForObject(API_BASE_URL, RecipeCard.class);
    }
}
