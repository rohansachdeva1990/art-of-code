package com.rohan.dp.mediator.solution.ex2;

import java.util.ArrayList;
import java.util.List;

// Subject
public abstract class UIControl {
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        eventHandlers.forEach(EventHandler::handle);
    }
}
