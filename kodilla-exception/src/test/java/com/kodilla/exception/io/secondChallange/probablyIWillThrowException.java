package com.kodilla.exception.io.secondChallange;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class probablyIWillThrowException {
    private SecondChallenge secondChallenge;

    @BeforeEach
    public void createSecondChallengeObject(){
        secondChallenge = new SecondChallenge();
    }

    @Test
    public void testXGreaterOrEqualTo2() {
        assertDoesNotThrow(() ->secondChallenge.probablyIWillThrowException(2.0 ,1.0));
    }

    @Test
    public void testYEqualTo1andHalf (){
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.5));

    }

    @Test
    public void testXlessThen1 (){
        assertDoesNotThrow(()-> secondChallenge.probablyIWillThrowException(0.5,1.0 ));
    }

    }
