package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigmac(){

        //given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("gluten Free")
                .burgers(3)
                .sauce("spicy")
                .ingredient("tomato")
                .ingredient("onions")
                .ingredient("pickle")
                .build();
        //when
        int burgerIngredients = bigmac.getIngredients().size();

        //then
        assertEquals(3,burgerIngredients);


    }
}
