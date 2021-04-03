package com.rohan.dp.state.solution.abuse;

public class Stopwatch {

/*    private boolean isRunning;

    public void click() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Stopped");
        }
        else {
            isRunning = true;
            System.out.println("Running");
        }
    }*/

    private State currentState = new StoppedState(this);

    public void click() {
        currentState.click();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
