package Patterns2.pizza;

import java.math.BigDecimal;

public class StandardPizzaOrder implements PizzaOrder {


    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza ingredients: crust, cheese, sauce";
    }
}
