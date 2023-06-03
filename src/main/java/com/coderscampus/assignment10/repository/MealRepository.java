package com.coderscampus.assignment10.repository;

import com.coderscampus.assignment10.dto.Meal;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MealRepository {
    private Map<Long, Meal> mealData = new HashMap<>();

    public void save(Meal meal) {
        mealData.put(meal.getId(), meal);
    }

    public Meal findMealById(Long mealID) {
        return mealData.get(mealID);
    }

    // Didnt need to do this because we are using the findMealById method
//    public Map<Long, Meal> getMealData() {
//        return mealData;
//    }
}
