package com.arfiz;

import com.arfiz.iterator.BrowseHistory;
import com.arfiz.memento.Editor;
import com.arfiz.memento.History;
import com.arfiz.state.Canvas;
import com.arfiz.state.EraserTool;
import com.arfiz.state.SelectionTool;
import com.arfiz.state.abuse.Stopwatch;

public class Main {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        var iterator = history.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
