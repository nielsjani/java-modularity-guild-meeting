package com.icecream;

import com.fooditem.FoodItem;

public class RainbowRocket implements FoodItem {
    @Override
    public String getName() {
        return "Rainbow Rocket";
    }

    @Override
    public void consume() {
        FoodItem.super.consume();
        System.out.println("Lick lick lick.");
        System.out.println("Aargh! Brainfreeze");
    }
}
