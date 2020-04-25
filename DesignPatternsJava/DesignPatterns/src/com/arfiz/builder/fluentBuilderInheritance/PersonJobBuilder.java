package com.arfiz.builder.fluentBuilderInheritance;

public class PersonJobBuilder<SELF extends PersonJobBuilder<SELF>> extends PersonInfoBuilder<PersonJobBuilder<SELF>>{
    public SELF worksAsA (String position) {
        person.position = position;
        return (SELF) this;
    }
}
