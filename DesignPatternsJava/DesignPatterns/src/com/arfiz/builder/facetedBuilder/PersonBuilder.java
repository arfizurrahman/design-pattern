package com.arfiz.builder.facetedBuilder;

public class PersonBuilder {
    protected Person person = new Person();

    public PersonJobBuilder works () {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives () {
        return new PersonAddressBuilder(person);
    }

    public Person build() {
        return person;
    }
}
