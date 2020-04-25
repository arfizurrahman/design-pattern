package com.arfiz.builder.fluentBuilderInheritance;

public class Person {
    public String name;
    public String position;

    public class Builder extends PersonJobBuilder<Builder> {

    }

    public Builder newBuilder () {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position;
    }
}
