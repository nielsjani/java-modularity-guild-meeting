package com.fooditem;

public interface FoodItem {
    public String getName();
    public default void consume() {
        System.out.println("Consuming " + getName());
    };
}
