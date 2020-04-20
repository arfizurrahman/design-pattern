package com.arfiz.SOLIDDesignPriciple.singleResponsibilityPriciple;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> entries = new ArrayList<>();

    private static int count = 0;

    public int addEntry(String text) {
        entries.add(++count +": " + text);
        return count;
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return entries.toString();
    }
}
