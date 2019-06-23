package com.fishyfeast;

import com.fooditem.FoodItem;

public class FishNChips implements FoodItem {

    private String sideDish;

    public FishNChips(String sideDish) {
        this.sideDish = sideDish;
    }

    @Override
    public String getName() {
        return "Fish n chips with " + sideDish;
    }

    @Override
    public void consume() {
        FoodItem.super.consume();
        System.out.println("You can taste the sea!");
    }
}
