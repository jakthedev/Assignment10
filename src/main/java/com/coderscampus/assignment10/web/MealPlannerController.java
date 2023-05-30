package com.coderscampus.assignment10.web;

import com.coderscampus.assignment10.dto.MealPlan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlannerController {

    @PostMapping("/mealplanner")
    public MealPlan createMealPlanner(@RequestParam String meal, @RequestParam String nutrients) {
        MealPlan mealplan = new MealPlan();
        mealplan.setMeals(meal);
        mealplan.setNutrients(nutrients);
        return mealplan;

    }

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
        public
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {

    }
}
