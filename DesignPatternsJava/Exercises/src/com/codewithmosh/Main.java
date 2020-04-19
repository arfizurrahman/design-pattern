package com.codewithmosh;

import com.codewithmosh.iterator.Product;
import com.codewithmosh.iterator.ProductCollection;
import com.codewithmosh.memento.Document;
import com.codewithmosh.memento.History;
import com.codewithmosh.state.DirectionService;
import com.codewithmosh.state.DrivingMode;
import com.codewithmosh.state.WalkingMode;

public class Main {

    public static void main(String[] args) {
        var collection = new ProductCollection();
        collection.add(new Product(1, "Pen"));
        collection.add(new Product(2, "Pencil"));
        collection.add(new Product(3, "Paper"));

        var iterator = collection.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
