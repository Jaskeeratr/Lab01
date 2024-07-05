package com.jaskeerat.calculator;

import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (args.length > 0) {
            // Process CLI arguments
            processArguments(args);
        } else {
            // No CLI arguments, ask for user input
            while (true) {
                System.out.println("\nEnter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial) or 'exit' to quit:");
                String operation = scanner.next();

                if (operation.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting calculator...");
                    break;
                }

                // For operations requiring two inputs
                if (!operation.equalsIgnoreCase("sqrt") && !operation.equalsIgnoreCase("log") && !operation.equalsIgnoreCase("log10") &&
                        !operation.equalsIgnoreCase("sin") && !operation.equalsIgnoreCase("cos") && !operation.equalsIgnoreCase("tan") &&
                        !operation.equalsIgnoreCase("factorial")) {
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();

                    switch (operation.toLowerCase()) {
                        case "add":
                            System.out.println("Result: " + add(num1, num2));
                            break;
                        case "subtract":
                            System.out.println("Result: " + subtract(num1, num2));
                            break;
                        case "multiply":
                            System.out.println("Result: " + multiply(num1, num2));
                            break;
                        case "divide":
                            if (num2 != 0) {
                                System.out.println("Result: " + divide(num1, num2));
                            } else {
                                System.out.println("Error: Division by zero is not allowed.");
                            }
                            break;
                        case "pow":
                            System.out.println("Result: " + power(num1, num2));
                            break;
                        default:
                            System.out.println("Invalid operation.");
                            break;
                    }
                } else {
                    // For operations requiring one input
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();

                    switch (operation.toLowerCase()) {
                        case "sqrt":
                            System.out.println("Result: " + sqrt(num));
                            break;
                        case "log":
                            System.out.println("Result: " + log(num));
                            break;
                        case "log10":
                            System.out.println("Result: " + log10(num));
                            break;
                        case "sin":
                            System.out.println("Result: " + sin(num));
                            break;
                        case "cos":
                            System.out.println("Result: " + cos(num));
                            break;
                        case "tan":
                            System.out.println("Result: " + tan(num));
                            break;
                        case "factorial":
                            if (num >= 0) {
                                System.out.println("Result: " + factorial((int) num));
                            } else {
                                System.out.println("Error: Factorial of negative number is undefined.");
                            }
                            break;
                        default:
                            System.out.println("Invalid operation.");
                            break;
                    }
                }
            }
        }

        scanner.close();
    }

    private static void processArguments(String[] args) {
        int i = 0;
        while (i < args.length) {
            String operation = args[i].toLowerCase();
            switch (operation) {
                case "add":
                    double addNum1 = Double.parseDouble(args[++i]);
                    double addNum2 = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + add(addNum1, addNum2));
                    break;
                case "subtract":
                    double subNum1 = Double.parseDouble(args[++i]);
                    double subNum2 = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + subtract(subNum1, subNum2));
                    break;
                case "multiply":
                    double mulNum1 = Double.parseDouble(args[++i]);
                    double mulNum2 = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + multiply(mulNum1, mulNum2));
                    break;
                case "divide":
                    double divNum1 = Double.parseDouble(args[++i]);
                    double divNum2 = Double.parseDouble(args[++i]);
                    if (divNum2 != 0) {
                        System.out.println("Result: " + divide(divNum1, divNum2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case "pow":
                    double base = Double.parseDouble(args[++i]);
                    double exponent = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + power(base, exponent));
                    break;
                case "sqrt":
                    double number = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + sqrt(number));
                    break;
                case "log":
                    number = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + log(number));
                    break;
                case "log10":
                    number = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + log10(number));
                    break;
                case "sin":
                    double angle = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + sin(Math.toRadians(angle)));
                    break;
                case "cos":
                    angle = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + cos(Math.toRadians(angle)));
                    break;
                case "tan":
                    angle = Double.parseDouble(args[++i]);
                    System.out.println("Result: " + tan(Math.toRadians(angle)));
                    break;
                case "factorial":
                    int num = Integer.parseInt(args[++i]);
                    if (num >= 0) {
                        System.out.println("Result: " + factorial(num));
                    } else {
                        System.out.println("Error: Factorial of negative number is undefined.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
            i++;
        }
    }

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        return a / b;
    }

    // Method for exponentiation
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method for square root
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    // Method for natural logarithm
    public static double log(double number) {
        return Math.log(number);
    }

    // Method for base-10 logarithm
    public static double log10(double number) {
        return Math.log10(number);
    }

    // Method for sine function
    public static double sin(double angleRadians) {
        return Math.sin(angleRadians);
    }

    // Method for cosine function
    public static double cos(double angleRadians) {
        return Math.cos(angleRadians);
    }

    // Method for tangent function
    public static double tan(double angleRadians) {
        return Math.tan(angleRadians);
    }

    // Factorial calculation with progress display
    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial of negative number is undefined.");
            return 0;
        }
        return factorialHelper(num, num);
    }

    private static long factorialHelper(int originalNum, int num) {
        if (num <= 1) {
            return 1;
        }
        // Calculate progress and update progress bar
        int progress = (int) (((originalNum - num + 1) / (double) originalNum) * 100);
        System.out.print("\rCalculating factorial: " + progress + "%");
        return num * factorialHelper(originalNum, num - 1);
    }
}
