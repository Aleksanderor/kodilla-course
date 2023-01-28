package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void mapSetup(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);


    }

    @Test
    void testCalculateForecastWithMock() {

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAvarageTemperature(){
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        double expectedAvarageTemperature = 25.56;
        double calculatedAvarageTemperature = weatherForecast.calculateAvarageTemperature();
        assertEquals(expectedAvarageTemperature, calculatedAvarageTemperature);
    }

    @Test
    void testCalculateMedianTemperature(){
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        double medianTemperature = weatherForecast.calculateMedianTemperature();
        assertEquals(25.5, medianTemperature);
    }
}