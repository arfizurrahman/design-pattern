package com.arfiz.builder.fluentBuilderInheritance;

public abstract class PersonBuilder {
    protected Person person = new Person();

    public Person build() {
        return person;
    }
}
