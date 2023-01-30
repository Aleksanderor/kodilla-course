package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;

        System.out.println("Test 1 - addAToB method:");
        int addResult = calculator.addAToB(a, b);
        if (addResult == 12) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test 2 - subtractAFromB method:");
        int subtractResult = calculator.SubstractAFromB(a, b);
        if (subtractResult == -2) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}