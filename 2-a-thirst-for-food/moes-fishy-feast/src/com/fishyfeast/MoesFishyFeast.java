package com.fishyfeast;

import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;

import java.util.List;

public class MoesFishyFeast {
    // 'Moe the Modular Duck' is Module land's mascot.

    public FoodItem eatSomeFish(List<FoodItemVoucher> vouchers, int index) {
        vouchers.forEach(FoodItemVoucher::stamp);
        return new FishNChips(index % 2 == 0 ? "extra chips" : "stoemp");
    }
}
