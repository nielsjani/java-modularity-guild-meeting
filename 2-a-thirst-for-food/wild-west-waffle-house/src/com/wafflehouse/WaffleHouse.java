package com.wafflehouse;

import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;
import com.foodstall.api.Foodstall;

import java.util.List;

public class WaffleHouse implements Foodstall {

    public FoodItem order(int id, List<FoodItemVoucher> vouchers) {
        if(id == 1) {
            return new WafflesAppetizingAppetizer();
        } else if (id == 2) {
            return new WafflesDeliciousSalad();
        } else {
            return new WafflesMouthWatheringSteak();
        }
    }
}
