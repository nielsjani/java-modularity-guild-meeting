package com.wafflehouse;

import com.fooditem.FoodItem;

public class WafflesMouthWatheringSteak implements FoodItem {
    @Override
    public String getName() {
        return "Waffle's Steak";
    }

    @Override
    public void consume() {
        FoodItem.super.consume();
        System.out.println("Hurray! It's not grass!");
    }
}
