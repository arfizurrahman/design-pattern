package com.arfiz.builder.fluentBuilderInheritance;

public class PersonInfoBuilder<SELF extends PersonInfoBuilder<SELF>> extends PersonBuilder
{
    public SELF called (String name) {
        person.name = name;
        return (SELF) this;
    }
}
