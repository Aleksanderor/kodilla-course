package com.kodilla.testing.patterns.FoodToDoor;

import java.time.LocalDate;

public class Order {

    private User user;

    private Product product;

    private LocalDate localDate;

    public Order(User user, Product product, LocalDate localDate) {
        this.localDate = localDate;
        this.product = product;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", product=" + product +
                ", localDate=" + localDate +
                '}';
    }
}
