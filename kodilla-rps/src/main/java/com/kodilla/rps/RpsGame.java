package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    private final String playerName;
    private final int numbOfWins;
    private int playerScore;
    private int compScore;

    public RpsGame(String playerName, int numbOfWins) {
        this.playerName = playerName;
        this.numbOfWins = numbOfWins;
    }

    public int getCompScore() {
        return compScore;
    }

    public int getNumbOfWins() {
        return numbOfWins;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void playerMove(Scanner scanner) {
        System.out.println("Wybierz swój ruch:");
        System.out.println("1 - kamień");
        System.out.println("2 - papier");
        System.out.println("3 - nożyce");
        int playerMove = scanner.nextInt();
        scanner.nextLine();
        play(playerMove);
    }
    private String playerMoveToString(int move) {
        String moveString;
        if (move == 1) {
            moveString = "kamień";
        } else if (move == 2) {
            moveString = "papier";
        } else if (move == 3) {
            moveString = "nożyce";
        } else {
            System.out.println("Nieprawidłowy ruch! Wybierz ponownie.");
            moveString = playerMoveToString(new Scanner(System.in).nextInt());
        }
        return moveString;
    }

    public void play(int playerMove) {

        int computerMove = generateComputerMove();
        if (playerMove == computerMove) {
            System.out.println("....... Remis .......");
        } else if ((playerMove == 1 && computerMove == 3) ||
                (playerMove == 2 && computerMove == 1) ||
                (playerMove == 3 && computerMove == 2)) {
            playerScore++;
            System.out.println("Wygrałeś rundę!");
        } else {
            compScore++;
            System.out.println("Przegrałeś rundę.");
        }
        System.out.println("Gracz " + playerName + " (" + playerMoveToString(playerMove) + ") vs " +
                "Komputer (" + playerMoveToString(computerMove) + ")");
        System.out.println("Wynik: " + playerName + " - " + playerScore + ", Komputer - " + compScore);
    }


    private int generateComputerMove() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public boolean isGameOver() {
        return playerScore == numbOfWins || compScore == numbOfWins;
    }

    public void printSummaryOfGame() {
        System.out.println("Kończymy grę :(");
        if (playerScore > compScore) {
            System.out.println("Gracz: " + getPlayerName() + "wygrał grę wynikiem:" + compScore + "/" + playerScore);
        } else if (compScore > playerScore) {
            System.out.println("Gracz: " + getPlayerName() + "przegrał grę wynikiem: " + compScore + "/" + playerScore);
        } else {
            System.out.println("Remis");

        }

//        public void newGame(Scanner scanner) {
//            System.out.println("Nowa gra");
//            RpsGame newGame = new RpsGame(playerName, numbOfWins);
//            newGame.play(scanner);
        }
    }
