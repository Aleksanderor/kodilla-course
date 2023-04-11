package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

        //then
        assertEquals(3,bigmac.getIngredients().size());
        assertEquals("gluten free", bigmac.getBun());
        assertEquals("spicy", bigmac.getSauce());
        assertTrue(bigmac.getIngredients().containsAll(Arrays.asList("tomato", "onions", "pickle")));


    }
}
