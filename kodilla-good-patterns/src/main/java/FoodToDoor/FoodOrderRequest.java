package FoodToDoor;

import java.time.LocalDateTime;

public class FoodOrderRequest {

    private User user;

    private Product product;

    private String foodSupplier;

    private LocalDateTime orderDate;

    public FoodOrderRequest(User user, LocalDateTime orderDate, Product product, String foodSupplier){
        this.foodSupplier=foodSupplier;
        this.orderDate= orderDate;
        this.product=product;
        this.user=user;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getFoodSupplier() {
        return foodSupplier;
    }

    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", product=" + product +
                ", orderDate=" + orderDate +
                ", distributor='" + foodSupplier + '\'' +
                '}';
    }
}
