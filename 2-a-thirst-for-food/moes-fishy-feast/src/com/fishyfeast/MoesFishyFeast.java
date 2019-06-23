package com.fishyfeast;

import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;
import com.foodstall.api.Foodstall;

import java.util.List;

public class MoesFishyFeast implements Foodstall {
    // 'Moe the Modular Duck' is Module land's mascot.

    @Override
    public FoodItem order(int index, List<FoodItemVoucher> vouchers) {
        vouchers.forEach(FoodItemVoucher::stamp);
        return new FishNChips(index % 2 == 0 ? "extra chips" : "stoemp");
    }
}
