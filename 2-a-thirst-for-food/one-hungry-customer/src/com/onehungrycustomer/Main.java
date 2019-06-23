package com.onehungrycustomer;

import com.fishyfeast.MoesFishyFeast;
import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;
import com.icecream.IceCreamParlor;
import com.wafflehouse.WaffleHouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //TODO: should become:
    //1. get all available food stalls
    //2. order the first item (id = 1) from each of them
    //3. consume these items
    public static void main(String[] args) {
        FoodItem iceCream = new IceCreamParlor().orderIceCream(1, new FoodItemVoucher("Mickey"));
        iceCream.consume();

        List<FoodItemVoucher> vouchersForFish = new ArrayList<>();
        vouchersForFish.add(new FoodItemVoucher("Donald"));
        vouchersForFish.add(new FoodItemVoucher("Donald"));
        vouchersForFish.add(new FoodItemVoucher("Donald"));
        FoodItem somethingFish = new MoesFishyFeast().eatSomeFish(vouchersForFish, 1);
        somethingFish.consume();

        List<FoodItemVoucher> vouchersForWaffleHouse = new ArrayList<>();
        vouchersForWaffleHouse.add(new FoodItemVoucher("Goofy"));
        vouchersForWaffleHouse.add(new FoodItemVoucher("Goofy"));
        vouchersForWaffleHouse.add(new FoodItemVoucher("Goofy"));
        FoodItem appetizer = new WaffleHouse().orderAtWaffleHouse(1, vouchersForWaffleHouse);
        appetizer.consume();

        //The following should not compile is you've implemented correctly:
        new IceCreamParlor();
        new MoesFishyFeast();
        new WaffleHouse();
    }
}
