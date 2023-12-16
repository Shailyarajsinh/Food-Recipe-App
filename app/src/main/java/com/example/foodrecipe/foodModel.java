package com.example.foodrecipe;

public class foodModel {

    int id;
    int foodimage;
    String foodtittle;
    String fooddescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoodimage() {
        return foodimage;
    }

    public void setFoodimage(int foodimage) {
        this.foodimage = foodimage;
    }

    public String getFoodtittle() {
        return foodtittle;
    }

    public void setFoodtittle(String foodtittle) {
        this.foodtittle = foodtittle;
    }

    public String getFooddescription() {
        return fooddescription;
    }

    public void setFooddescription(String fooddescription) {
        this.fooddescription = fooddescription;
    }

    public foodModel(int id, int foodimage, String foodtittle, String fooddescription) {
        this.id = id;
        this.foodimage = foodimage;
        this.foodtittle = foodtittle;
        this.fooddescription = fooddescription;
    }
}
