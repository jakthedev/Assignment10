package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.awt.*;

public class MealTypeResponse {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("imageType")
    private String imageType;
    @JsonProperty("readyInMinutes")
    private Integer readyInMinutes;
    @JsonProperty("servings")
    private Integer servings;
    @JsonProperty("sourceUrl")
    private String sourceUrl;
//
//    public MealTypeResponse(Integer id, String title, String imageType, Integer readyInMinutes, Integer servings,
//                 String sourceUrl) {
//        super();
//        this.id = id;
//        this.title = title;
//        this.imageType = imageType;
//        this.readyInMinutes = readyInMinutes;
//        this.servings = servings;
//        this.sourceUrl = sourceUrl;
//    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImagetype() {
        return imageType;
    }

    public Integer getReadyInMinutes() {
        return readyInMinutes;
    }

    public Integer getServings() {
        return servings;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImagetype(String imageType) {
        this.imageType = imageType;
    }

    public void setReadyInMinutes(Integer readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }
}
