package com.rohan.dp.observer.solution.ex1.push;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // We can use Object or generics to be more flexible
    public void notifyObservers(int value) {
        for (var observer : observers) {
            observer.update(value);
        }
    }

}
