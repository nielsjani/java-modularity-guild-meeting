package com.foodstall.api;

import com.fooditem.FoodItem;
import com.fooditem.FoodItemVoucher;

import java.util.List;

public interface Foodstall {

    public FoodItem order(int id, List<FoodItemVoucher> vouchers);
}
