package com.joysistvi.stage2.activity.day22;

public class RegularEmployee extends Employee implements Bonus, Audit {

    private static final double ATTENDANCE_BONUS = 1000;
    private static final double TAX_RATE = 0.10;


    // Constructor
    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }


    // Compute salary
    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }


    // Compute deductions
    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }


    // Compute bonus
    @Override
    public double computeBonus() {
        return baseSalary * 0.05;
    }


    // Employee type
    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }


    // Bonus eligibility
    @Override
    public boolean isEligibleForBonus() {
        return true;
    }


    // Generate employee ID
    @Override
    public String generateEmployeeId() {
        return "REG-" + name.toUpperCase();
    }


    // Audit log
    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId + " salary computed.");
    }
}
