package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to factor: ");
        int number = scanner.nextInt();

        ArrayList<Integer> result = converter.primeFactors(number);
        System.out.println("Prime factors: " + result);
    }
}
