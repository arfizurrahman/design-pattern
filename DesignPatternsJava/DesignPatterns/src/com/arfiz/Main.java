package com.arfiz;

import com.arfiz.bridge.AdvancedRemoteControl;
import com.arfiz.bridge.RemoteControl;
import com.arfiz.bridge.SonyTV;
import com.arfiz.flyweight.PointIconFactory;
import com.arfiz.flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SonyTV());
        remoteControl.turnOn();
    }
}
