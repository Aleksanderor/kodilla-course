package com.kodilla.testing.PATTERNS.FoodToDoor;

import com.kodilla.testing.PATTERNS.FoodToDoor.FoodDistributors.ExtraFoodShop;
import com.kodilla.testing.PATTERNS.FoodToDoor.FoodDistributors.FoodDistributors;

public class OrderProcessor {
    public void process(FoodOrderRequest orderRequest) {
        getDistributor(orderRequest).process(orderRequest);
    }

    public FoodDistributors getDistributor(FoodOrderRequest orderRequest) {
        if (orderRequest.getFoodSupplier().equals("ExtraFoodShop")) {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        if (orderRequest.getFoodSupplier().equals("GlutenFreeShop")) {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        if (orderRequest.getFoodSupplier().equals("HealthyShop")) {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        return null;
    }
}


