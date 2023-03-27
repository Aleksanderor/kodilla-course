package com.kodilla.testing.patterns.flights;

import java.util.Objects;

public class Flight {

    private final String flightStart;

    private final String flightEnd;

    public Flight (String flightStart, String flightEnd){
        this.flightEnd=flightEnd;
        this.flightStart=flightStart;
    }

    public String getFlightEnd() {
        return flightEnd;
    }

    public String getFlightStart() {
        return flightStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightStart, flight.flightStart) && Objects.equals(flightEnd, flight.flightEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightStart, flightEnd);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightStart='" + flightStart + '\'' +
                ", flightEnd='" + flightEnd + '\'' +
                '}';
    }
}
