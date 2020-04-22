package com.arfiz.SOLIDDesignPriciple.dependencyInversionPriciple.excerciseTwo;

public class Demo {
    public static void main(String[] args) {
        var empManager = new EmployeeManager();
        empManager.addEmployee(new Employee("Arfiz", Gender.MALE, Position.MANAGER));
        empManager.addEmployee(new Employee("Farhana", Gender.FEMALE, Position.MANAGER));
        var stats = new EmployeeStatistics(empManager);
        System.out.println("Number of male managers in our company is: " + stats.countMaleManagers());
    }
}
