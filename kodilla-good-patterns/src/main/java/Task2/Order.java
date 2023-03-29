package Task2;

public class Order {
    private final User user;
    private final Product product;
    private final int quantity;

    public Order(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotal() {
        return product.getPrice() * quantity;
    }
}

