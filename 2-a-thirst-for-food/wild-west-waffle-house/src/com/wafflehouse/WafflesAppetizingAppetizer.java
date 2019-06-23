package com.wafflehouse;

import com.fooditem.FoodItem;

public class WafflesAppetizingAppetizer implements FoodItem {
    @Override
    public String getName() {
        return "Waffle's Appetizer";
    }

    @Override
    public void consume() {
        FoodItem.super.consume();
        System.out.println("Wait... It's just grass in a champagne glass?");
    }
}
