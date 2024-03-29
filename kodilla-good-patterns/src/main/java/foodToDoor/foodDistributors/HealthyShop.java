package foodToDoor.foodDistributors;

import foodToDoor.FoodOrderRequest;

public class HealthyShop implements FoodDistributors {

    private String CompanyName = "HealthyShop";

    @Override
    public void process(FoodOrderRequest orderRequest) {
        System.out.println("Zamówienie od: " + CompanyName);
        System.out.println(orderRequest.getUser().getName() + " " + orderRequest.getUser() + " zamówiłeś: x"
                + orderRequest.getProduct().getProductQuantity() + " " + orderRequest.getProduct().getProductName() + "\n");
    }
}
