package foodToDoor;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        User user = new User("Olek","olek@gg.ww");
        Product product = new Product("Awokado",7,1000);
        LocalDateTime localDate= LocalDateTime.now();
        String foodSupplier = "HealthyShop";
        FoodOrderRequest foodOrderRequest = new FoodOrderRequest(user, localDate, product, foodSupplier);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(foodOrderRequest);
    }


}
