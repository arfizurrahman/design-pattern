package com.arfiz;

import com.arfiz.memento.Editor;
import com.arfiz.memento.History;
import com.arfiz.state.Canvas;
import com.arfiz.state.EraserTool;
import com.arfiz.state.SelectionTool;
import com.arfiz.state.abuse.Stopwatch;

public class Main {

    public static void main(String[] args) {
        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
    }
}
