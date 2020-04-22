package com.arfiz.interpreter;

public class Int implements IElement{
    private int value;

    public Int(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
