package com.arfiz.SOLIDDesignPriciple.openClosedPriciple;

public class ColorSpecification implements ISpecification<Product>{
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.color == color;
    }
}
