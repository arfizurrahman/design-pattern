package com.arfiz.SOLIDDesignPriciple.dependencyInversionPriciple.excerciseTwo;

import java.util.List;

public interface IEmployeeSearchable {
    List<Employee> GetEmployeesByGenderAndPosition(Gender gender, Position position);
}
