package com.lgy.designpatterns.observer.test1.observer;

import com.lgy.designpatterns.observer.test1.subject.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private WeatherData weatherData;

    /**
     * 温度
     */

    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度:" + this.temperature);
        System.out.println("当前湿度:" + this.humidity);
        System.out.println("当前气压:" + this.pressure);
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }
}
