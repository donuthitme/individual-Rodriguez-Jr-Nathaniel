package com.joysistvi.stage2.activity.day22;

public class SalesEmployee extends Employee implements Bonus {

    private double commission;

    private static final double TAX_RATE = 0.12;


    // Constructor
    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }


    // Compute salary
    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }


    // Compute deductions
    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }


    // Employee type
    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }


    // Compute bonus
    @Override
    public double computeBonus() {
        return commission * 0.10;
    }


    // Bonus eligibility
    @Override
    public boolean isEligibleForBonus() {
        return commission > 0;
    }
}