package com.example.mealmate;

import android.widget.ImageView;
import android.widget.TextView;

public class datamodel {

    int mealImage;
    String mealName;
    String mealPrice;
    String mealDesc;

    public int getMealImage() {
        return mealImage;
    }

    public void setMealImage(int mealImage) {
        this.mealImage = mealImage;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }

    public String getMealDesc() {
        return mealDesc;
    }

    public void setMealDesc(String mealDesc) {
        this.mealDesc = mealDesc;
    }



    public datamodel(int mealImage, String mealName, String mealPrice, String mealDesc) {
        this.mealImage = mealImage;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealDesc = mealDesc;
    }
}
