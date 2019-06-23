package com.icecream;

import com.fooditem.FoodItem;

public class BananaSplit implements FoodItem {
    @Override
    public String getName() {
        return "Banana split";
    }

    @Override
    public void consume() {
        FoodItem.super.consume();
        System.out.println("Slurp slurp. Gobble gobble");
        System.out.println("Gotta split");
    }
}
