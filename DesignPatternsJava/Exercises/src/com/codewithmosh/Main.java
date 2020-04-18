package com.codewithmosh;

import com.codewithmosh.memento.Document;
import com.codewithmosh.memento.History;
import com.codewithmosh.state.DirectionService;
import com.codewithmosh.state.DrivingMode;
import com.codewithmosh.state.WalkingMode;

public class Main {

    public static void main(String[] args) {
        var directionService = new DirectionService(new WalkingMode());
        directionService.getDirection();
        directionService.getEta();
    }
}
