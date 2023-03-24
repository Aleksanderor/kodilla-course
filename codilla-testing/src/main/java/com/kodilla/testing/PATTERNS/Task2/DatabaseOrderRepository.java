package com.kodilla.testing.PATTERNS.Task2;

public class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(Order order) {
        System.out.println("Saving order for user " + order.getUser().getName() + " in database");
    }
}
