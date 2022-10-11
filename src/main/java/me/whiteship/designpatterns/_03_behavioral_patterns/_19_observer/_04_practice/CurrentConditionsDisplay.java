package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._04_practice;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("현재 상태: 온도 " + temperature
        + "F, 습도 " + humidity + "%");
    }
}
