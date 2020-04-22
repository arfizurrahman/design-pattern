package com.arfiz.SOLIDDesignPriciple.dependencyInversionPriciple.excerciseTwo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements IEmployeeSearchable{
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    @Override
    public List<Employee> GetEmployeesByGenderAndPosition(Gender gender, Position position) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (var employee : employees)
            if (employee.getGender() == gender && employee.getPosition() == position)
                filteredEmployees.add(employee);

        return filteredEmployees;
    }
}
