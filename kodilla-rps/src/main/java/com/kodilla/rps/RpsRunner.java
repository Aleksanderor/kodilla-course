package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("witaj w grze papier, kamieć, nożyce :)");
        System.out.println("podaj imię dla gracza");

        String playerName = scanner.nextLine();

        System.out.println("Podaj liczbę rund");

        int numbOfWins = scanner.nextInt();

        RpsGame rpsGame = new RpsGame(playerName, numbOfWins);

        while (!rpsGame.isGameOver()) {
            rpsGame.playerMove(scanner);
        }
        rpsGame.printSummaryOfGame();

        System.out.println("Jeżeli chcesz zagrać jeszcze raz wpisz" + "n" + " w przeciwnym wypadku wpisz" + "x");
        String contiunueGameDecision = scanner.nextLine();
        while (!contiunueGameDecision.equalsIgnoreCase("n") && !contiunueGameDecision.equalsIgnoreCase("x")) {
            System.out.println("Nieprawna wartość.. wpisz" + " n" + "lub " + "x");
            contiunueGameDecision = scanner.nextLine();
        }

        if (contiunueGameDecision.equalsIgnoreCase("n")) {
           // newGame();
        } else {
            System.out.println("Do zobaczenia!");
        }
    }
    }

