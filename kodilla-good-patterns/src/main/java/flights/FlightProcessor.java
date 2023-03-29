package flights;

import java.util.List;

public class FlightProcessor {

    public static void main(String[] args) {

        MemoryFlightDepository memoryFlightDepository = new MemoryFlightDepository();

        Flight flight1 = new Flight("Poznań", "Katowice");
        Flight flight2 = new Flight("Warsaw", "Radom");
        Flight flight3 = new Flight("London", "Szczecin");
        Flight flight4 = new Flight("Poznań", "Sosnowiec");
        Flight flight5 = new Flight("Katowice", "Zakopane");

        memoryFlightDepository.addFlight(flight1);
        memoryFlightDepository.addFlight(flight2);
        memoryFlightDepository.addFlight(flight3);
        memoryFlightDepository.addFlight(flight4);
        memoryFlightDepository.addFlight(flight5);

        List<Flight> flightsFromPoznan = memoryFlightDepository.getStartFlightCity("Poznań");
        List<Flight> flightsEndZakopane = memoryFlightDepository.getEndFlightCity("Sosnowiec");
        List<Flight> flightsIntermediateCity = memoryFlightDepository.getEndFlightCity("Sosnowiec");

        System.out.println("Flight from Poznań"+ flightsFromPoznan);
        System.out.println("Flight that end in Sosnowiec " + flightsEndZakopane );
        System.out.println("Flight that that have a mid landing" + flightsIntermediateCity);






    }
}

