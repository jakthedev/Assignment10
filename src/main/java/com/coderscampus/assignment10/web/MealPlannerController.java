package com.coderscampus.assignment10.web;

import com.coderscampus.assignment10.dto.Meal;
import com.coderscampus.assignment10.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Meal getMeal (@PathVariable Long mealId) {
        System.out.print("Meal ID is: " + mealId);
        return mealRepo.findMealById(mealId);
    }


//    @GetMapping("mealplanner/week")
//    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
//        public
//    }

//    @GetMapping("mealplanner/day")
//    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
//
//    }
}
