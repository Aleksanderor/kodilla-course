package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


    Calculator calculator = new Calculator();

    int addResult = calculator.addAToB(2,2);
    int substractResult = calculator.SubstractAFromB(9,8);

       if(addResult == 4 && substractResult == 1) {
           System.out.println("Calculator works :)");
       } else {
           System.out.println("Something dosent work : (");
       }
    }
}