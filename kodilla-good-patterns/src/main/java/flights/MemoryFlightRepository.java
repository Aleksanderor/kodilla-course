package flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoryFlightRepository implements FlightRepository {

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

    @Override
    public List<Flight> findConnectingFlights(String startCity, String endCity) {
        List<Flight> connectingFlights = new ArrayList<>();

        List<Flight> flightsWithStartCity = flightsList.stream()
                .filter(flight -> flight.getFlightStart().equals(startCity))
                .collect(Collectors.toList());

        List<Flight> flightsWithEndCity = flightsList.stream()
                .filter(flight -> flight.getFlightEnd().equals(endCity))
                .collect(Collectors.toList());

        for (Flight flight1 : flightsWithStartCity) {
            for (Flight flight2 : flightsWithEndCity) {
                if (flight1.getFlightEnd().equals(flight2.getFlightStart())) {
                    connectingFlights.add(flight1);
                    connectingFlights.add(flight2);
                }
            }
        }
        return connectingFlights;
    }

    @Override
    public String toString() {
        return "MemoryFlightDepository{" +
                "flightsList=" + flightsList +
                '}';
    }
}
