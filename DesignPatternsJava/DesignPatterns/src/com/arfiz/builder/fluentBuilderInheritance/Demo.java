package com.arfiz.builder.fluentBuilderInheritance;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        var me =person.newBuilder().called("Arfiz").worksAsA("ENf").build();
        System.out.println(me);
    }
}
