package com.icecream;

import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;
import com.foodstall.api.Foodstall;

import java.util.List;

public class IceCreamParlor implements Foodstall {

    public FoodItem order(int foodId, List<FoodItemVoucher> vouchers) {
        vouchers.get(0).stamp();
        if(foodId == 1) {
            return new RainbowRocket();
        }
        if(foodId == 2) {
            return new BananaSplit();
        }
        throw  new IllegalArgumentException("COuld not offer food for " + foodId);
    }
}
