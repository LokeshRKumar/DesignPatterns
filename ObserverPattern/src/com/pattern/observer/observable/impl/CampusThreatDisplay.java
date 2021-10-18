package com.pattern.observer.observable.impl;

import com.pattern.observer.displayelement.DisplayElement;
import com.pattern.observer.observable.Observable;
import com.pattern.observer.subject.impl.CampusSecurity;

public class CampusThreatDisplay implements Observable, DisplayElement {
    private CampusSecurity campusSecurity;
    private String campusThreatInstructions;

    public CampusThreatDisplay(CampusSecurity campusSecurity){
        campusSecurity.addObserver(this);
        this.campusSecurity = campusSecurity;
    }
    @Override
    public void display() {
        System.out.println("Recent campus threat instructions: " + this.campusThreatInstructions);
    }

    @Override
    public void update() {
        this.campusThreatInstructions = this.campusSecurity.getCampusThreats();
        display();
    }
}
