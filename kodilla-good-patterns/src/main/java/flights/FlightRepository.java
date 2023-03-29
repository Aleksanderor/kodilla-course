package flights;

import java.util.List;

public interface FlightRepository {

    void addFlight (Flight flight);

    List<Flight> getStartFlightCity(String flightStart);

    List<Flight> getEndFlightCity(String flightStart);

    List<Flight> findConnectingFlights (String startCity, String endCity);

}
