package com.kodilla.stream.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    @DisplayName("When calculating average from array" +
            "then it should calculate the right average")
    public void testAverage() {

        //Given
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(3.3, average);
    }
}
