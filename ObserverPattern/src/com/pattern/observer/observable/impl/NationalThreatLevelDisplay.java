package com.pattern.observer.observable.impl;

import com.pattern.observer.displayelement.DisplayElement;
import com.pattern.observer.observable.Observable;
import com.pattern.observer.subject.impl.CampusSecurity;

public class NationalThreatLevelDisplay implements Observable, DisplayElement {
    private CampusSecurity campusSecurity;
    private int nationalThreatLevel;

    public NationalThreatLevelDisplay(CampusSecurity campusSecurity){
        campusSecurity.addObserver(this);
        this.campusSecurity = campusSecurity;
    }

    @Override
    public void display() {
        System.out.println("Recent national threat level: " + this.nationalThreatLevel);
    }

    @Override
    public void update() {
        this.nationalThreatLevel = this.campusSecurity.getNationalThreatLevel();
        display();
    }
}
