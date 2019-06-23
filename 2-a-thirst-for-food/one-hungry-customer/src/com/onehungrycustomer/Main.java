package com.onehungrycustomer;

import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;
import com.foodstall.api.Foodstall;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Main {
    //TODO: should become:
    //1. get all available food stalls
    //2. order the first item (id = 1) from each of them
    //3. consume these items
    public static void main(String[] args) {
        ServiceLoader.load(Foodstall.class)
                .forEach(foodstall -> {
                    FoodItem order = foodstall.order(1, createVoucher());
                    order.consume();
                });

        //The following should not compile is you've implemented correctly:
//        new IceCreamParlor();
//        new MoesFishyFeast();
//        new WaffleHouse();
    }

    private static List<FoodItemVoucher> createVoucher() {
        List<FoodItemVoucher> foodItemVouchers = new ArrayList<>();
        foodItemVouchers.add(new FoodItemVoucher("Me"));
        return foodItemVouchers;
    }
}
