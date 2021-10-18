package com.pattern.observer.subject;

import com.pattern.observer.observable.Observable;

public interface Subject {
    void addObserver(Observable observer);
    void removeObserver(Observable observer);
    void notifyObservers();
}
