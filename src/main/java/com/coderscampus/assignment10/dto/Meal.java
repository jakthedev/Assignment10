package com.coderscampus.assignment10.dto;

import java.util.Objects;

public class Meal {

    private String meals;
    private String nutrients;
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meal meal)) return false;
        return getId().equals(meal.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Meal{" +
                "meals='" + meals + '\'' +
                ", nutrients='" + nutrients + '\'' +
                ", id=" + id +
                '}';
    }
}
