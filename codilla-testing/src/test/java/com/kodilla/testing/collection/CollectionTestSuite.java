package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Nested
public class CollectionTestSuite {

    @BeforeEach
        public void before() {
        System.out.println("Test has begun");
    }

    @AfterEach
        public void after() {
                System.out.println("Test has ended");
        }
    @DisplayName("When creating empty array" +
                 "then extermiante method in OddNumbersExterminator class should add anything to new array")

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        assertEquals(expected, result);

    }

    @DisplayName("When using the exterminate method from OddNumbersExterminator class on a array" +
                 "then it should return an array with even numbers only")
    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> mixNumbers = new ArrayList<>();
        mixNumbers.add(1);
        mixNumbers.add(2);
        mixNumbers.add(3);
        mixNumbers.add(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);

        //When
        List <Integer> result = exterminator.exterminate(mixNumbers);

        //Then
        assertEquals(expected, result);
    }
}