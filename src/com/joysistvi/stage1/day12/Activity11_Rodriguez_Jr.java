package com.joysistvi.stage1.day12;

public class Activity11_Rodriguez_Jr {
    public static void main(String[] args) {
        /*
        1. Math.abs()

        Description:
        Returns the absolute value of a number.
        The absolute value changes a negative number into a positive number.

        Syntax:
        Math.abs(number);
        */

        System.out.println("===== 1. Math.abs() =====");

        // Example 1
        System.out.println(Math.abs(-100));

        // Example 2
        System.out.println(Math.abs(25));


        /*
        2. Math.max()

        Description:
        Returns the larger value between two numbers.

        Syntax:
        Math.max(number1, number2);
        */

        System.out.println("\n===== 2. Math.max() =====");

        // Example 1
        System.out.println(Math.max(10, 20));

        // Example 2
        System.out.println(Math.max(50, 30));


        /*
        3. Math.min()

        Description:
        Returns the smaller value between two numbers.

        Syntax:
        Math.min(number1, number2);
        */

        System.out.println("\n===== 3. Math.min() =====");

        // Example 1
        System.out.println(Math.min(10, 20));

        // Example 2
        System.out.println(Math.min(50, 30));


        /*
        4. Math.pow()

        Description:
        Raises a number to a specified power.
        The first value is the base and the second value is the exponent.

        Syntax:
        Math.pow(base, exponent);
        */

        System.out.println("\n===== 4. Math.pow() =====");

        // Example 1
        System.out.println(Math.pow(2, 3));

        // Example 2
        System.out.println(Math.pow(5, 2));


        /*
        5. Math.sqrt()

        Description:
        Returns the square root of a number.

        Syntax:
        Math.sqrt(number);
        */

        System.out.println("\n===== 5. Math.sqrt() =====");

        // Example 1
        System.out.println(Math.sqrt(25));

        // Example 2
        System.out.println(Math.sqrt(100));


        /*
        6. Math.round()

        Description:
        Rounds a decimal number to the nearest whole number.
        A decimal value of .5 or higher is rounded upward.

        Syntax:
        Math.round(number);
        */

        System.out.println("\n===== 6. Math.round() =====");

        // Example 1
        System.out.println(Math.round(5.4));

        // Example 2
        System.out.println(Math.round(5.5));


        /*
        7. Math.ceil()

        Description:
        Rounds a decimal number upward to the nearest whole number.

        Syntax:
        Math.ceil(number);
        */

        System.out.println("\n===== 7. Math.ceil() =====");

        // Example 1
        System.out.println(Math.ceil(5.2));

        // Example 2
        System.out.println(Math.ceil(6.8));


        /*
        8. Math.floor()

        Description:
        Rounds a decimal number downward to the nearest whole number.

        Syntax:
        Math.floor(number);
        */

        System.out.println("\n===== 8. Math.floor() =====");

        // Example 1
        System.out.println(Math.floor(5.2));

        // Example 2
        System.out.println(Math.floor(5.8));


        /*
        9. Math.random()

        Description:
        Generates a random decimal number from 0.0 up to 1.0, but not including, 1.0.

        Syntax:
        Math.random();

        Note:
        Every time the program runs, it can produce a different result.
        */

        System.out.println("\n===== 9. Math.random() =====");

        // Example 1
        System.out.println(Math.random());

        // Example 2
        System.out.println(Math.random());


        /*
        10. Math.log()

        Description:
        Returns the natural logarithm of a number.
        The natural logarithm uses the mathematical constant e as its base.

        Syntax:
        Math.log(number);
        */

        System.out.println("\n===== 10. Math.log() =====");

        // Example 1
        System.out.println(Math.log(10));

        // Example 2
        System.out.println(Math.log(100));


        /*
        11. Math.log10()

        Description:
        Returns the logarithm of a number using 10 as the base.

        Syntax:
        Math.log10(number);
        */

        System.out.println("\n===== 11. Math.log10() =====");

        // Example 1
        System.out.println(Math.log10(10));

        // Example 2
        System.out.println(Math.log10(100));


        /*
        12. Math.exp()

        Description:
        Returns the value of e raised to the specified power.

        Syntax:
        Math.exp(number);
        */

        System.out.println("\n===== 12. Math.exp() =====");

        // Example 1
        System.out.println(Math.exp(1));

        // Example 2
        System.out.println(Math.exp(2));


        /*
        13. Math.sin()

        Description:
        Returns the sine of an angle.
        The angle must be provided in radians.

        Syntax:
        Math.sin(angle);

        Note:
        Java uses radians instead of degrees for trigonometric
        methods.
        */

        System.out.println("\n===== 13. Math.sin() =====");

        // Example 1
        System.out.println(Math.sin(0));

        // Example 2
        System.out.println(Math.sin(Math.PI / 2));


        /*
        14. Math.cos()

        Description:
        Returns the cosine of an angle.
        The angle must be provided in radians.

        Syntax:
        Math.cos(angle);
        */

        System.out.println("\n===== 14. Math.cos() =====");

        // Example 1
        System.out.println(Math.cos(0));


        /*
        15. Math.tan()

        Description:
        Returns the tangent of an angle.
        The angle must be provided in radians.

        Syntax:
        Math.tan(angle);
        */

        System.out.println("\n===== 15. Math.tan() =====");

        // Example 1
        System.out.println(Math.tan(0));

    }
}
