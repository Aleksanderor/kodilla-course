package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private Map<String, Boolean> airportMap;

    public FlightSearch() {
        airportMap = new HashMap<String, Boolean>();
        airportMap.put("Warszawa", true);
        airportMap.put("Gdansk", true);
        airportMap.put("Krakow", false);
        airportMap.put("Poznan", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        String departure = flight.getDepartureAirport();
        String arrival = flight.getArrivalAirport();

        if (!airportMap.containsKey(departure) || !airportMap.get(departure)) {
            throw new RouteNotFoundException("no depart airport in : " + departure);
        }

        if (!airportMap.containsKey(arrival) || !airportMap.get(arrival)) {
            throw new RouteNotFoundException("no arrival airport in : " + arrival);
        }

        System.out.println("Flight from " + departure + " to " + arrival + " found.");
    }
}


