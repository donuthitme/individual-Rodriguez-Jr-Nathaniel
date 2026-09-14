package com.joysistvi.stage2.activity.day21;

public class Employee {

    protected String name;
    protected double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to compute salary
    public double computeSalary() {
        return baseSalary;
    }

    // Print payslip
    public void printPayslip() {
        System.out.println(name + "'s salary: " + computeSalary());
    }
}
