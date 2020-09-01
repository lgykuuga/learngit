package com.lgy.designpatterns.observer.test1.subject;

import com.lgy.designpatterns.observer.test1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {


    private List<Observer> observers;

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
    /**
     * 未来几天的温度
     */
    private List<Float> forecastTemperatures;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void setMeasurements(float temperature, float humidity, float pressure, List<Float> forecastTemperatures) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.forecastTemperatures = forecastTemperatures;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public List<Float> getForecastTemperatures() {
        return forecastTemperatures;
    }
}
