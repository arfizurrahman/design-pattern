package com.arfiz.SOLIDDesignPriciple.openClosedPriciple;

public interface ISpecification<T> {
    boolean isSatisfied(T t);
}
