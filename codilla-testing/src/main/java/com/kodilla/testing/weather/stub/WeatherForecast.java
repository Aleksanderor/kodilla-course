package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAvarageTemperature() {
        Map<String, Double> resultMap = temperatures.getTemperatures();
        int numTemperatures = resultMap.size();
        double sum = 0;
        for (double tempResult : resultMap.values()) {
            sum += tempResult;
        }
        return sum / numTemperatures;
    }

    public double calculateMedianTemperature() {
        Map<String, Double> tempMap = temperatures.getTemperatures();
        double[] tempArray = new double[tempMap.size()];
        int i = 0;
        for (Double temp : tempMap.values()) {
            tempArray[i] = temp;
            i++;
        }
        Arrays.sort(tempArray);
        if (tempArray.length % 2 == 0) {
            return (tempArray[tempArray.length / 2] + tempArray[tempArray.length / 2 - 1]) / 2;
        } else {
            return tempArray[tempArray.length / 2];
        }
    }
}