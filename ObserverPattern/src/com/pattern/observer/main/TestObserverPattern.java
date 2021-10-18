package com.pattern.observer.main;

import com.pattern.observer.observable.Observable;
import com.pattern.observer.observable.impl.CampusThreatDisplay;
import com.pattern.observer.observable.impl.NationalThreatLevelDisplay;
import com.pattern.observer.observable.impl.WeatherConditionDisplay;
import com.pattern.observer.subject.impl.CampusSecurity;

public class TestObserverPattern {
    public static void main(String[] args) {

        CampusSecurity security = new CampusSecurity();

        Observable campusThreatDisplay = new CampusThreatDisplay(security);
        Observable nationalThreatDisplay = new NationalThreatLevelDisplay(security);
        Observable weatherConditionsDisplay = new WeatherConditionDisplay(security);

        security.setNewSecurityAlerts("Humid", 1, "Stay inside.");

        security.removeObserver(weatherConditionsDisplay);

        security.setNewSecurityAlerts("Monsoon", 1, "Stay inside.");

    }
}
