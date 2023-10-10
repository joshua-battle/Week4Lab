package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        add();
        mutliply();
        divide();
        subtract();
    }


    private static void subtract() {
        System.out.println("Please your first number for subtraction :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number for subtraction :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
    }
    private static void divide() {
        System.out.println("Please your first number for division :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number for division :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("The total is " + total);
    }

    private static void mutliply() {
        System.out.println("Please your first number for multiplication :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number multiplication :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
    }

    public static void add()
    {
        System.out.println("Please your first number for addition :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number for addition :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);

    }
}
