package com.rohan.dp.observer.solution.ex2;

import java.util.ArrayList;
import java.util.List;

public class AbstractSubject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (var observer : observers) {
            observer.priceChanged();
        }
    }
}
