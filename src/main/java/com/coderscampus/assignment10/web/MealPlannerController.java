package com.coderscampus.assignment10.web;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.Meal;
import com.coderscampus.assignment10.dto.WeekResponse;
import com.coderscampus.assignment10.repository.MealRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class MealPlannerController {

    @Autowired
    private MealRepository mealRepo;

    @PostMapping("/mealplanner")
    public Meal createMealPlanner(@RequestParam String meal, @RequestParam String nutrients, Long mealId) {
        Meal mealPlan = new Meal();
        mealPlan.setMeals(meal);
        mealPlan.setNutrients(nutrients);
        mealPlan.setId(mealId);
        mealRepo.save(mealPlan); //spoonacular
        return mealPlan;
    }

    @GetMapping("/mealplanner/{mealId}")
    public Meal getMeal(@PathVariable Long mealId) {
        System.out.print("Meal ID is: " + mealId);
        return mealRepo.findMealById(mealId);
    }


    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
        return (ResponseEntity<WeekResponse>) getSpoonacularResponse(numCalories, diet, exclusions, "week", WeekResponse.class);
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
        return (ResponseEntity< DayResponse>) getSpoonacularResponse(numCalories, diet, exclusions, "day", DayResponse.class);
    }

    private ResponseEntity<?> getSpoonacularResponse(String numCalories, String diet,
                                                     String exclusions, String timeFrame, Class<?> responseClass) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", timeFrame)
                .queryParam("apiKey", "b29a37620629424fa7b0a72c05b9e8cc");
        if (!StringUtils.isEmpty(numCalories)) {
            builder = builder.queryParam("targetCalories", Integer.parseInt(numCalories));
        }
        if (!StringUtils.isEmpty(diet)) {
            builder = builder.queryParam("diet", diet);
        }
        if (!StringUtils.isEmpty(exclusions)) {
            builder = builder.queryParam("exclude", exclusions);
        }

        URI uri = builder.build().toUri();

        RestTemplate rt = new RestTemplate();
        ResponseEntity<?> responseEntity = rt.getForEntity(uri, responseClass);
        return responseEntity;
    }
}
