package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestConverter {
    Converter converter;

    @BeforeEach
    void setup() {
        converter = new Converter();
    }

    @Test
    void testPrimeFactorsOf60() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 3, 5));
        assertEquals(expected, converter.primeFactors(60));
    }

    @Test
    void testPrimeFactorsOf13() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(13));
        assertEquals(expected, converter.primeFactors(13));
    }

    @Test
    void testPrimeFactorsOf1() {
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, converter.primeFactors(1));
    }
}
