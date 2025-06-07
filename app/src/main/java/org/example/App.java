package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ounce Conversion Program!\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many ounces do you have? ");
        int ounces = scanner.nextInt();

        System.out.println("Thank you! Converting ounces to pounds.\n");

        Converter converter = new Converter();
        System.out.printf("%d oz is equivalent to %s.\n", ounces, converter.toPoundsAndOunces(ounces));
        System.out.printf("%d oz is equivalent to %s.\n", ounces, converter.toPounds(ounces));

        System.out.println("\nThank you for using the OCP!");
        scanner.close();
    }
}