package com.kodilla.hibernate.Patterns2.pizza;

import java.math.BigDecimal;

public class Salami extends AbstractPizzaDecorator {

    public Salami(PizzaOrder pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", salami";
    }
}