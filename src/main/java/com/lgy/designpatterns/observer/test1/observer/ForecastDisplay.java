package com.lgy.designpatterns.observer.test1.observer;

import com.lgy.designpatterns.observer.test1.subject.WeatherData;

import java.util.List;

public class ForecastDisplay  implements DisplayElement, Observer {

    private WeatherData weatherData;

    /**
     * 未来几天的温度
     */
    private List<Float> forecastTemperatures;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("未来几天温度");
        int count = this.forecastTemperatures.size();
        for (int i = 0; i < count; i++) {
            System.out.println("第" + i + "天:" + forecastTemperatures.get(i) + "度");
        }
    }

    @Override
    public void update() {
        this.forecastTemperatures = this.weatherData.getForecastTemperatures();
        display();
    }
}
