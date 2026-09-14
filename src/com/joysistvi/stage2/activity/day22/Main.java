package com.joysistvi.stage2.activity.day22;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75)
        };


        for (Employee e : employees) {

            e.printPayslip();


            // Check if employee is Bonusable
            if (e instanceof Bonus) {

                Bonus b = (Bonus) e;

                if (b.isEligibleForBonus()) {
                    System.out.println("Bonus: " + b.computeBonus());
                }
            }


            // Check if employee is Auditable
            if (e instanceof Audit) {

                Audit a = (Audit) e;

                a.logSalaryComputation(
                        a.generateEmployeeId()
                );
            }


            System.out.println("--------------------------------");
        }
    }
}
