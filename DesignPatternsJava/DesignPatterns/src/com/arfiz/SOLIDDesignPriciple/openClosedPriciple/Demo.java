package com.arfiz.SOLIDDesignPriciple.openClosedPriciple;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        var apple = new Product("Apple", Color.GREEN, Size.SMALL);
        var tree = new Product("Tree", Color.GREEN, Size.LARGE);
        var house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(tree);
        products.add(house);

        var pf = new ProductFilter();
        System.out.println("Green Products: ");
        for(var p : pf.filter(products, new ColorSpecification(Color.GREEN))){
            System.out.println(" - " + p.name + " is green");
        }

        System.out.println("Large Products: ");
        for(var p : pf.filter(products, new SizeSpecification(Size.LARGE))){
            System.out.println(" - " + p.name + " is large");
        }

        System.out.println("Large Blue Products: ");
        for(var p :
                pf.filter(products,
                        new AndSpecification<Product>(
                                new ColorSpecification(Color.BLUE),
                                new SizeSpecification(Size.LARGE)))){
            System.out.println(" - " + p.name + " is large and blue");
        }
    }
}
