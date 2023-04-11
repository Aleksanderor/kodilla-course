package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigmacTestSuite {

    @Test
    void testNewBigMac(){

        //given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("gluten free")
                .burgers(3)
                .sauce("spicy")
                .ingredient("tomato")
                .ingredient("onions")
                .ingredient("pickle")
                .build();

        //when
        int burgerIngredients = bigmac.getIngredients().size();
        String expectedBigMacBun = bigmac.getBun();
        String expectedBigMacSauce = bigmac.getSauce();
        List<String> actualBigMacIngredients = bigmac.getIngredients();
        List<String> expectedBigMacIngredients = Arrays.asList("tomato", "onions", "pickle");


        //then
        assertEquals(3,burgerIngredients);
        assertEquals("gluten free", expectedBigMacBun);
        assertEquals("spicy", expectedBigMacSauce);
        assertTrue(actualBigMacIngredients.containsAll(expectedBigMacIngredients));


    }
}
