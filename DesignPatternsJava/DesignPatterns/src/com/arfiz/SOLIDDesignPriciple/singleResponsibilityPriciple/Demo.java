package com.arfiz.SOLIDDesignPriciple.singleResponsibilityPriciple;

public class Demo {
    public static void main(String[] args) {
        var j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);
    }
}
