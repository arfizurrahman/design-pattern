package com.arfiz.SOLIDDesignPriciple.liskovSubstitutionPrinciple;

public class Square extends Rectangle{
    private int width;
    private int height;

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}
