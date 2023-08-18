package com.rayala30.reciperunway.service;

import com.rayala30.reciperunway.model.RecipeImage;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestRecipeImageService implements RecipeImageService {

    public static String API_BASE_URL = "https://api.edamam.com/api/recipes/v2";

    private RestTemplate restTemplate = new RestTemplate();


    @Override
    public RecipeImage getImage() {
        return restTemplate.getForObject(API_BASE_URL, RecipeImage.class);
    }
}
