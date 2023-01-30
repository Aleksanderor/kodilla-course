package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
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

       if(addResult == 4) {
           System.out.println("Adding method in calculator works :) ");
       } else {
           System.out.println("Adding method in calculator class dosent work : ( ");
       }
       if (substractResult == 1) {
           System.out.println("Substracting metod in calculator class works :)");
       }else{
           System.out.println("Substracting method in calculator class doest work : (");
       }
    }
}