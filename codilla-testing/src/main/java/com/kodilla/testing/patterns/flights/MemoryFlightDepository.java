package com.kodilla.testing.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoryFlightDepository implements FlightRepository {

    private final List<Flight> flightsList = new ArrayList<>();

    @Override
    public void addFlight(Flight flight){
        flightsList.add(flight);
    }

    @Override
    public List<Flight> getStartFlightCity(String startFlightCity) {
        return flightsList.stream()
                .filter(flight -> flight.getFlightStart().equals(startFlightCity))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> getEndFlightCity (String flightEndCity){
        return flightsList.stream()
                .filter(flight -> flight.getFlightEnd().equals(flightEndCity))
                .collect(Collectors.toList());
    }
    public List<Flight> getIntermidiateCity (String intermediateCity){
        return flightsList.stream()
                .filter(flight -> flight.getFlightEnd().equals(intermediateCity))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "MemoryFlightDepository{" +
                "flightsList=" + flightsList +
                '}';
    }
}
