package com.arfiz.SOLIDDesignPriciple.openClosedPriciple;

public class AndSpecification<T> implements ISpecification<T> {
    private ISpecification<T> first, second;

    public AndSpecification(ISpecification<T> first, ISpecification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T t) {
        return first.isSatisfied(t) && second.isSatisfied(t);
    }
}
