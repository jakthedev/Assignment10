package com.coderscampus.assignment10.spoonacular;

import com.coderscampus.assignment10.dto.MealTypeResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class SpoonacularIntegration {

    @Test
    public void callApi() {
        RestTemplate rt = new RestTemplate();

        // https://api.spoonacular.com/recipes/716429/information?apiKey=YOUR-API-KEY&includeNutrition=true
        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/recipes/716429/information")
                        .queryParam("apiKey", "b29a37620629424fa7b0a72c05b9e8cc")
                            .queryParam("includeNutrition", "true")
                                .build()
                                        .toUri();

        ResponseEntity<MealTypeResponse> response = rt.getForEntity(uri, MealTypeResponse.class);
        System.out.println(response.getBody());
    }
}
