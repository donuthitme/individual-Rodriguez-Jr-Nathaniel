package com.joysistvi.stage2.activity.day21;

public class SalesEmployee  extends Employee {

    private double commission;

    // Constructor
    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    // Override computeSalary()
    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }
}
