package com.kodilla.exception.io.secondChallange;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyWillThrowException() {

        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when, then

        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.49));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 1.49));
    }

    @Test
    void willThrowExceptionCases(){

        SecondChallenge secondChallenge = new SecondChallenge();
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1,1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(12,1.51));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0,1.51));



    }
}
