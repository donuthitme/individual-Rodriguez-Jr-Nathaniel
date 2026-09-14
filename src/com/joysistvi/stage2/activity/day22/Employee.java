package com.joysistvi.stage2.activity.day22;

public abstract class Employee {

    // Protected fields
    protected String name;
    protected double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract methods
    public abstract double computeSalary();

    public abstract String getEmployeeType();

    public abstract double computeDeductions();


    // Concrete method
    public double computeNetSalary() {
        return computeSalary() - computeDeductions();
    }


    // Print payslip
    public void printPayslip() {

        System.out.println(
                name + "'s gross salary: "
                        + computeSalary()
                        + " (" + getEmployeeType() + ")"
        );

        System.out.println("Deductions: " + computeDeductions());

        System.out.println("Net salary: " + computeNetSalary());
    }
}
