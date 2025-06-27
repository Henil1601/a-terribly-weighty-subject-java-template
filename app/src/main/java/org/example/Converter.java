package org.example;

import java.util.ArrayList;

public class Converter {
    public ArrayList<Integer> primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number = number / i;
            }
        }
        return factors;
    }
}
