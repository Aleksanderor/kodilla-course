package com.kodilla.spring.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorTestSuite {

@Test
    public void calculatorClassTests() {

        // given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // when
        double addTotal = calculator.add(2.1, 2);
        double subDif = calculator.sub(4, 2.1);
        double mulTot = calculator.mul(3, 3.1);
        double divTot = calculator.div(8, 2);

        // then
        assertEquals(4.1, addTotal);
        assertEquals(1.9, subDif);
        assertEquals(9.3, mulTot);
        assertEquals(4.0, divTot);

    }

}
