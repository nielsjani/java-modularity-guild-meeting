package com.icecream;

import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;

public class IceCreamParlor {

    public FoodItem orderIceCream(int foodId, FoodItemVoucher foodItemVoucher) {
        foodItemVoucher.stamp();
        if(foodId == 1) {
            return new RainbowRocket();
        }
        if(foodId == 2) {
            return new BananaSplit();
        }
        throw  new IllegalArgumentException("COuld not offer food for " + foodId);
    }
}
