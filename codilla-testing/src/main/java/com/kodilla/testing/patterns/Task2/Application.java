package com.kodilla.testing.patterns.Task2;

public class Application {
    public static void main(String[] args) {
    User user = new User("Olek", "olek@1111.com");
    Product product = new Product("Komputer", 666.66);
    OrderNotificationService notificationService = new EmailOrderNotificationService();
    OrderRepository repository = new DatabaseOrderRepository();
    ProductOrderService orderService = new ProductOrderService(notificationService, repository);

    int quantity = 1;
    orderService.processOrder(user, product, quantity);
}
}