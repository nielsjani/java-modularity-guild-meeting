package com.wafflehouse;

import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;

import java.util.List;

public class WaffleHouse {

    public FoodItem orderAtWaffleHouse(int id, List<FoodItemVoucher> vouchers) {
        if(id == 1) {
            return new WafflesAppetizingAppetizer();
        } else if (id == 2) {
            return new WafflesDeliciousSalad();
        } else {
            return new WafflesMouthWatheringSteak();
        }
    }
}
