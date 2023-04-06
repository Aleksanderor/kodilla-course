package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b){
        double total = a + b;
        display.displayValue(total);
        return total;
    }

    public double sub(double a, double b){
        double dif = a-b;
        display.displayValue(dif);
        return dif;
    }

    public double mul (double a, double b){
        double mulTotal = a*b;
        display.displayValue(mulTotal);
        return mulTotal;
    }

    public double div (double a, double b){
        double divTotal = a/b;
        display.displayValue(divTotal);
        return divTotal;
    }
}
