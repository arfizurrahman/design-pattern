package com.arfiz;

import com.arfiz.SOLIDDesignPriciple.dependencyInversionPriciple.excerciseTwo.*;
import com.arfiz.SOLIDDesignPriciple.liskovSubstitutionPrinciple.Rectangle;
import com.arfiz.SOLIDDesignPriciple.liskovSubstitutionPrinciple.Square;
import com.arfiz.SOLIDDesignPriciple.openClosedPriciple.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var empManager = new EmployeeManager();
        empManager.addEmployee(new Employee("Arfiz", Gender.MALE, Position.MANAGER));
        empManager.addEmployee(new Employee("Farhana", Gender.FEMALE, Position.MANAGER));
        var stats = new EmployeeStatistics(empManager);
        System.out.println("Number of male managers in our company is: " + stats.countMaleManagers());
    }
}
