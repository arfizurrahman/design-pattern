package com.arfiz;

import com.arfiz.bridge.AdvancedRemoteControl;
import com.arfiz.bridge.RemoteControl;
import com.arfiz.bridge.SonyTV;
import com.arfiz.flyweight.PointIconFactory;
import com.arfiz.flyweight.PointService;
import com.arfiz.proxy.EbookProxy;
import com.arfiz.proxy.Library;
import com.arfiz.proxy.LogginEbookProxy;
import com.arfiz.proxy.RealBook;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.add(new LogginEbookProxy(fileName));

        library.openEBook("a");
    }
}
