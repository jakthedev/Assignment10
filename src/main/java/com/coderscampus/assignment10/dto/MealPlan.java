package com.coderscampus.assignment10.dto;

public class MealPlan {

    private String meals;
    private String nutrients;

    @Override
    public String toString() {
        return "MealPlan{" +
                "meals='" + meals + '\'' +
                ", nutrients='" + nutrients + '\'' +
                '}';
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public void setNutrients(String nutrients) {
        this.nutrients = nutrients;
    }

    public String getMeals() {
        return meals;
    }

    public String getNutrients() {
        return nutrients;
    }
}
