package com.in28minutes.ifstatement;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is - " + number1 + '\n');

        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number you entered is = " + number2 + '\n');

        System.out.print("Enter Operation ");
        char operation = scanner.next().trim().charAt(0);
        System.out.println("The Operation you chose is " + operation + '\n');

        performOperationUsingSwitch(number1, number2, operation);
    }

    private static void performOperationUsingSwitch(int number1, int number2, int choice) {
        switch(choice) {
            case '/':
                System.out.println("Result: " + (number1 / number2));
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2));
                break;
            case '+':
                System.out.println(("Result: " + (number1 + number2)));
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2));
                break;
            default:
                System.out.println("Functionality Complete!");
        }
    }
}

