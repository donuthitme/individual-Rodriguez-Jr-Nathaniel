package com.joysistvi.stage2.activity.day21;

public class ContractualEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    // Constructor
    public ContractualEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Override computeSalary()
    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }
}
