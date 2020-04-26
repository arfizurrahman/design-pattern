package com.arfiz.builder.facetedBuilder;

public class Demo {
    public static void main(String[] args) {
        var pb = new PersonBuilder();
        var person = pb.lives().at("Sayed shah Road").in("Chittagong").withPostcode("1223")
                .works().at("Vivasoft").asA("Software Engineer").earning(12000).build();

        System.out.println(person);
    }
}
