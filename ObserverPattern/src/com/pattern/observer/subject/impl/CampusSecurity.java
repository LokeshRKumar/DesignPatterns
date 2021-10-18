package com.pattern.observer.subject.impl;

import com.pattern.observer.observable.Observable;
import com.pattern.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class CampusSecurity implements Subject {
    private List<Observable> observers;

    private String weatherConditions;
    private int nationalThreatLevel;
    private String campusThreats;

    public CampusSecurity(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observable observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observable observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.stream().forEach(observable -> observable.update());
    }

    public String getWeatherConditions() {
        return weatherConditions;
    }

    public int getNationalThreatLevel() {
        return nationalThreatLevel;
    }

    public String getCampusThreats() {
        return campusThreats;
    }

    public void setNewSecurityAlerts(String weatherConditions, int nationalThreatLevel, String campusThreats) {
        this.weatherConditions = weatherConditions;
        this.nationalThreatLevel = nationalThreatLevel;
        this.campusThreats = campusThreats;
        notifyObservers();
    }
}
