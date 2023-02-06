package com.kodilla.stream.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    @DisplayName("Calculating people word population +" +
            "then it should calculate the right quantity")
    public void testWorldPeopleQuantity(){
        //Given
        Country country1 = new Country(new BigDecimal("2313232132"));
        Country country2 = new Country(new BigDecimal("2313232132"));
        Country country3 = new Country(new BigDecimal("2313232132"));
        Country country4 = new Country(new BigDecimal("2313232132"));
        Country country5 = new Country(new BigDecimal("2313232132"));
        Country country6 = new Country(new BigDecimal("2313232132"));

        Continent continent1 = new Continent();
        continent1.addCountry(country1);
        continent1.addCountry(country2);

        Continent continent2 = new Continent();
        continent2.addCountry(country3);
        continent2.addCountry(country4);

        Continent continent3 = new Continent();
        continent3.addCountry(country5);
        continent3.addCountry(country6);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //Then
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal worldExpectedPopulation = new BigDecimal("13879392792");
        assertEquals(worldExpectedPopulation, worldPopulation);




    }
}
