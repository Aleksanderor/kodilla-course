package com.kodilla.testing.patterns.Task2;

public class ProductOrderService {
    private final OrderNotificationService notificationService;
    private final OrderRepository repository;

    public ProductOrderService(OrderNotificationService notificationService, OrderRepository repository) {
        this.notificationService = notificationService;
        this.repository = repository;
    }

    public void processOrder(User user, Product product, int quantity) {
        Order order = new Order(user, product, quantity);
        double total = order.calculateTotal();
        repository.saveOrder(order);
        notificationService.notifyUser(user, "Your order for " + quantity + " x " + product.getName() + " for " + total);
    }
}

