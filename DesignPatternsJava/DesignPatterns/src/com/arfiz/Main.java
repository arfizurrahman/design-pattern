package com.arfiz;

import com.arfiz.SOLIDDesignPriciple.singleResponsibilityPriciple.Journal;
import com.arfiz.SOLIDDesignPriciple.singleResponsibilityPriciple.Persistence;

public class Main {
    public static void main(String[] args) {
        var j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        var p = new Persistence();
        var fileName = "journal.txt";
        p.saveToFile(j, fileName, true);
    }
}
