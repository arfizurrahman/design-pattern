package com.arfiz.SOLIDDesignPriciple.openClosedPriciple;

public class SizeSpecification implements ISpecification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.size == size;
    }
}
