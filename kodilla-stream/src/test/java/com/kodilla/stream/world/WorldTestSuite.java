package com.kodilla.stream.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    @DisplayName("Calculating people word population +" +
            "then it should calculate the right quantity")
    public void testWorldPeopleQuantity() {

        //Given
        Continent continent1 = new Continent();
        continent1.addCountry(new Country("france", new BigDecimal("2313232132")));
        continent1.addCountry(new Country("poland", new BigDecimal("2313232132")));

        Continent continent2 = new Continent();
        continent1.addCountry(new Country("usa", new BigDecimal("2313232132")));
        continent1.addCountry(new Country("canada", new BigDecimal("2313232132")));

        Continent continent3 = new Continent();
        continent1.addCountry(new Country("italy", new BigDecimal("2313232132")));
        continent1.addCountry(new Country("germany", new BigDecimal("2313232132")));

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal worldExpectedPopulation = new BigDecimal("13879392792");
        assertEquals(worldExpectedPopulation, worldPopulation);
    }
    @Test
    void testGetPeopleQuantityIf0Countries(){

        //Given
        World world = new World();
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();

        //When
        world.addContinent(continent1);
        world.addContinent(continent2);

        BigDecimal peopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedQuantity = new BigDecimal(0);

        //Then
        assertEquals(peopleQuantity, expectedQuantity);

    }


    }

