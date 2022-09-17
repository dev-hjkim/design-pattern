package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._04_practice;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatures;
    private float highTemperature;
    private float lowTemperature;
    private float avgTemperature;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.temperatures = new ArrayList<>();
        this.highTemperature = Float.MIN_VALUE;
        this.lowTemperature = Float.MAX_VALUE;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);

        this.highTemperature = Math.max(temperature, this.highTemperature);
        this.lowTemperature = Math.min(temperature, lowTemperature);
        this.avgTemperature = sum(this.temperatures) / this.temperatures.size();
        display();
    }

    public float sum(List<Float> list) {
        int sum = 0;
        for (float num : list) {
            sum += num;
        }
        return sum;
    }

    public void display() {
        System.out.println("평균/최고/최저 온도 = " + avgTemperature + "/"
        + highTemperature + "/" + lowTemperature);
    }
}
