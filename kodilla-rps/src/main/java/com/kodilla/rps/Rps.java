package com.kodilla.rps;

import java.util.Random;

public class Rps {
    private String[] attributes = {"Rock", "Paper", "Scissors"};
    private String computerAttribute;
    private String playerAttribute;

    public void newGame() {
        this.computerAttribute = null;
        this.playerAttribute = null;
    }

    public void chooseMove() {
        Random random = new Random();
        int index = random.nextInt(3);
        this.computerAttribute = attributes[index];
    }

    public void computerMove() {
        System.out.println("Przeciwnik wylosował ruch.");
    }

    public String getPlayerAttribute() {
        return playerAttribute;
    }

    public String getComputerAttribute() {
        return computerAttribute;
    }

    public String compareTheMovements() {
        if (playerAttribute.equals(computerAttribute)) {
            return "Draw";
        } else if (playerAttribute.equals("Rock") && computerAttribute.equals("Scissors") ||
                playerAttribute.equals("Paper") && computerAttribute.equals("Rock") ||
                playerAttribute.equals("Scissors") && computerAttribute.equals("Paper")) {
            return "You win";
        } else {
            return "Defeat";
        }
    }
}
