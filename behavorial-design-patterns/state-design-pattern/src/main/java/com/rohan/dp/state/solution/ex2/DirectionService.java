package com.rohan.dp.state.solution.ex2;

public class DirectionService {

    private TravelMode travelMode;

    public DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

}
