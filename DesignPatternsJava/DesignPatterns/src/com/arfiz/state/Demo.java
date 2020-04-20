package com.arfiz.state;

import com.arfiz.SOLIDDesignPriciple.singleResponsibilityPriciple.Journal;

public class Demo {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
