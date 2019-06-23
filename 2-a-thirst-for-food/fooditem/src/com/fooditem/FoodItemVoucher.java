package com.fooditem;

import java.time.LocalDate;

public class FoodItemVoucher {
    private String owner;
    private LocalDate validUntil;
    private boolean stamped;

    public FoodItemVoucher(String owner) {
        this.owner = owner;
        this.validUntil = LocalDate.now().plusDays(5);
    }

    public String getOwner() {
        return owner;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void stamp() {
        if(stamped) {
            throw new IllegalArgumentException("Already stamped");
        }
        stamped = true;
    }
}
