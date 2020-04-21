package com.arfiz.SOLIDDesignPriciple.liskovSubstitutionPrinciple;

public class Demo {
    static public int area(Rectangle r) {
        return r.getWidth() * r.getHeight();
    }
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2,3);
        System.out.println(rc + " has area " + area(rc));

        Rectangle sq = new Square();
        sq.setHeight(4);
        System.out.println(sq + " has area " + area(sq));
    }
}
