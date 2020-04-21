package com.arfiz;

import com.arfiz.SOLIDDesignPriciple.liskovSubstitutionPrinciple.Rectangle;
import com.arfiz.SOLIDDesignPriciple.liskovSubstitutionPrinciple.Square;
import com.arfiz.SOLIDDesignPriciple.openClosedPriciple.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
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
