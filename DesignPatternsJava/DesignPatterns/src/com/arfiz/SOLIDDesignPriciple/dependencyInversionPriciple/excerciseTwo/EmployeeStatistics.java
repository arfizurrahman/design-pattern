package com.arfiz.SOLIDDesignPriciple.dependencyInversionPriciple.excerciseTwo;

public class EmployeeStatistics {
    private IEmployeeSearchable employee;

    public EmployeeStatistics(IEmployeeSearchable employee) {
        this.employee = employee;
    }

    public int countMaleManagers(){
        var employees = employee.GetEmployeesByGenderAndPosition(Gender.MALE, Position.MANAGER);
        return employees.size();
    }
}
