package com.pattern.observer.observable.impl;

import com.pattern.observer.displayelement.DisplayElement;
import com.pattern.observer.observable.Observable;
import com.pattern.observer.subject.impl.CampusSecurity;

public class WeatherConditionDisplay implements Observable, DisplayElement {
    private CampusSecurity campusSecurity;
    private String WeatherConditions;

    public WeatherConditionDisplay(CampusSecurity campusSecurity){
        campusSecurity.addObserver(this);
        this.campusSecurity = campusSecurity;
    }
    @Override
    public void update() {
        this.WeatherConditions = this.campusSecurity.getWeatherConditions();
        display();
    }
    @Override
    public void display() {
        System.out.println("Recent updates on weather conditions: " + this.WeatherConditions);
    }
}
