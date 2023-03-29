package FoodToDoor.FoodDistributors;

import com.kodilla.testing.patterns.FoodToDoor.FoodOrderRequest;

public class GlutenFreeShop implements FoodDistributors {

    private String CompanyName = "GlutenFreeShop";

    @Override
    public void process(FoodOrderRequest orderRequest) {
        System.out.println("Zamówienie od: " + CompanyName);
        System.out.println(orderRequest.getUser().getName() + " " + orderRequest.getUser() + " zamówiłeś: x"
                + orderRequest.getProduct().getProductQuantity() + " " + orderRequest.getProduct().getProductName() + "\n");
    }
}
