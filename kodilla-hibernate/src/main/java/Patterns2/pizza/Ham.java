package Patterns2.pizza;

import java.math.BigDecimal;

public class Ham extends AbstractPizzaDecorator {

    public Ham(PizzaOrder pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", ham";
    }
}

