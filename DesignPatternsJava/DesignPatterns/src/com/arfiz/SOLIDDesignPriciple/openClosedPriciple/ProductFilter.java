package com.arfiz.SOLIDDesignPriciple.openClosedPriciple;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter implements IFilter<Product>{
    @Override
    public List<Product> filter(List<Product> items, ISpecification<Product> spec) {
        List<Product> filteredProducts = new ArrayList<>();
        for (var i : items)
            if (spec.isSatisfied(i))
                filteredProducts.add(i);

        return filteredProducts;
    }
}
