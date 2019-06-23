package com.wafflehouse;

import com.fooditem.FoodItem;

public class WafflesDeliciousSalad implements FoodItem {
    @Override
    public String getName() {
        return "Waffle's Salad";
    }

    @Override
    public void consume() {
        FoodItem.super.consume();
        System.out.println("Hurray! It's grass!");
    }
}
