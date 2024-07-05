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
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide, factorial):");
            String operation = scanner.next();

            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Enter the first operand:");
                    double addNum1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double addNum2 = scanner.nextDouble();
                    System.out.println("Result: " + add(addNum1, addNum2));
                    break;
                case "subtract":
                    System.out.println("Enter the first operand:");
                    double subNum1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double subNum2 = scanner.nextDouble();
                    System.out.println("Result: " + subtract(subNum1, subNum2));
                    break;
                case "multiply":
                    System.out.println("Enter the first operand:");
                    double mulNum1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double mulNum2 = scanner.nextDouble();
                    System.out.println("Result: " + multiply(mulNum1, mulNum2));
                    break;
                case "divide":
                    System.out.println("Enter the first operand:");
                    double divNum1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    double divNum2 = scanner.nextDouble();
                    if (divNum2 != 0) {
                        System.out.println("Result: " + divide(divNum1, divNum2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case "factorial":
                    System.out.println("Enter a number:");
                    int number = scanner.nextInt();
                    System.out.println("Result: " + factorial(number));
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }

        scanner.close();
    }

    private static void processArguments(String[] args) {
        if (args.length < 2) {
            System.out.println("Insufficient arguments provided.");
            return;
        }

        String operation = args[0].toLowerCase();
        switch (operation) {
            case "add":
                double addNum1 = Double.parseDouble(args[1]);
                double addNum2 = Double.parseDouble(args[2]);
                System.out.println("Result: " + add(addNum1, addNum2));
                break;
            case "subtract":
                double subNum1 = Double.parseDouble(args[1]);
                double subNum2 = Double.parseDouble(args[2]);
                System.out.println("Result: " + subtract(subNum1, subNum2));
                break;
            case "multiply":
                double mulNum1 = Double.parseDouble(args[1]);
                double mulNum2 = Double.parseDouble(args[2]);
                System.out.println("Result: " + multiply(mulNum1, mulNum2));
                break;
            case "divide":
                double divNum1 = Double.parseDouble(args[1]);
                double divNum2 = Double.parseDouble(args[2]);
                if (divNum2 != 0) {
                    System.out.println("Result: " + divide(divNum1, divNum2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case "factorial":
                int number = Integer.parseInt(args[1]);
                System.out.println("Result: " + factorial(number));
                break;
            default:
                System.out.println("Invalid operation.");
                break;
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

    // Method for factorial (using recursion)
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
