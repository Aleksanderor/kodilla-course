package com.kodilla.hibernate.Patterns2.pizza;

import java.math.BigDecimal;

public class Onions extends AbstractPizzaDecorator {
    public Onions(PizzaOrder pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", onions";
    }
}
