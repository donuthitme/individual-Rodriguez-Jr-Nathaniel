package com.joysistvi.stage2.activity.day21;

public class RegularEmployee extends Employee {
    // Constructor
    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    // Override computeSalary()
    @Override
    public double computeSalary() {
        return baseSalary + 1000;
    }
}
