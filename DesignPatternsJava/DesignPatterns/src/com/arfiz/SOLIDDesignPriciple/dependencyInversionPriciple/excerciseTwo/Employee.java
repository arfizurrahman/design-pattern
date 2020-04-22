package com.arfiz.SOLIDDesignPriciple.dependencyInversionPriciple.excerciseTwo;

public class Employee {
    private String name;
    private Gender gender;
    private Position position;

    public Employee(String name, Gender gender, Position position) {
        this.name = name;
        this.gender = gender;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Position getPosition() {
        return position;
    }

}
