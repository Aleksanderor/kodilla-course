package com.kodilla.exception.test;

public class RouteNotFoundExceptionHandling {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        Flight flight1 = new Flight("Warszawa", "Krakow");

        try {
            flightSearch.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
