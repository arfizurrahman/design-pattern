package com.codewithmosh.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void attach(EventHandler handler){
        eventHandlers.add(handler);
    }

    protected void notifyEventHandlers(){
        for(var handler : eventHandlers)
            handler.handle();
    }
}
