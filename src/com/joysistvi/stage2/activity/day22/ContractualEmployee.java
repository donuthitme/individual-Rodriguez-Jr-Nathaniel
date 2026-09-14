package com.joysistvi.stage2.activity.day22;

public class ContractualEmployee extends Employee implements Audit {

    private double hoursWorked;
    private double hourlyRate;

    private static final double TAX_RATE = 0.05;


    // Constructor
    public ContractualEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    // Compute salary
    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }


    // Compute deductions
    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }


    // Employee type
    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }


    // Generate employee ID
    @Override
    public String generateEmployeeId() {
        return "CON-" + name.toUpperCase();
    }


    // Audit log
    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId + " salary computed.");
    }
}
