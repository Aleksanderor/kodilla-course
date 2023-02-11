package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    Map<String, Boolean> flights = new HashMap<>();

    public FlightFinder() {
        flights.put("Warsaw", true);
        flights.put("New York", true);
        flights.put("Berlin", true);
        flights.put("London", false);

    }

    public void findFlight(Flight flight) throws RouteNotFoundException{
        if (!flights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("No departure airport: " + flight.getDepartureAirport());
        }

        if (!flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("No arrival airport: " + flight.getArrivalAirport());
        }

        if (!flights.get(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Departure airport " + flight.getDepartureAirport() + " is closed.");
        }

        if (!flights.get(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Arrival airport " + flight.getArrivalAirport() + " is closed.");
        }

        System.out.println("Found flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("London", "Warsaw");

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("error: " + e.getMessage());
        }
}
    }
