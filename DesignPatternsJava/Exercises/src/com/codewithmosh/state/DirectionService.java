package com.codewithmosh.state;

public class DirectionService {
    private TravelMode currentMode;

    public DirectionService(TravelMode currentMode){
        this.currentMode = currentMode;
    }

    public Object getEta() {
        return currentMode.getEta();
    }

    public Object getDirection() {
        return currentMode.getDirection();
    }

    public TravelMode getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(TravelMode currentMode) {
        this.currentMode = currentMode;
    }
}
