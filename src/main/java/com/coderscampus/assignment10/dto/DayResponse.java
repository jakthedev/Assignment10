package com.coderscampus.assignment10.dto;

import java.util.List;

public class DayResponse {

    private List<MealTypeResponse> meals;
    private Nutients nutrients;

    public Nutients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutients nutrients) {
        this.nutrients = nutrients;
    }

    public java.util.List<MealTypeResponse> getMeals() {
        return meals;
    }

    public void setMeals(java.util.List<MealTypeResponse> meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "DayResponse [meals=" + meals + "]";
    }
}
