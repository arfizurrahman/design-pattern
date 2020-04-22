package com.arfiz.interpreter;

public class BinaryOperation implements IElement{

    public enum Type {
        ADDITION, SUBTRACTION
    }

    public Type type;
    public IElement left, right;

    public int value;

    @Override
    public int getValue() {
        switch (type){
            case ADDITION:
                return left.getValue() + right.getValue();
            case SUBTRACTION:
                return left.getValue() - right.getValue();
            default:
                throw new IllegalArgumentException();
        }
    }
}
