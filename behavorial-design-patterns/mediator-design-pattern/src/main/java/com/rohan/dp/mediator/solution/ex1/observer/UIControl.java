package com.rohan.dp.mediator.solution.ex1.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    // List of observers
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    // Attaching a observer
    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    // Updating the observers on change
    protected void notifyEventHandlers() {
        for (var eventHandler : eventHandlers) {
            eventHandler.handle();
        }
    }
}
