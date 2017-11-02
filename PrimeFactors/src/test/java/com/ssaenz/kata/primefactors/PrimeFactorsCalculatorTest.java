package com.ssaenz.kata.primefactors;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsCalculatorTest {

    @Test
    public void prime_factors_of_2_is_2() {
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(2);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_3_is_3() {
        List<Integer> expected = Arrays.asList(3);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(3);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_4_is_2_2() {
        List<Integer> expected = Arrays.asList(2, 2);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(4);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_5_is_5() {
        List<Integer> expected = Arrays.asList(5);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(5);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_6_is_2_3() {
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(6);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_7_is_7() {
        List<Integer> expected = Arrays.asList(7);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(7);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_8_is_2_2_2() {
        List<Integer> expected = Arrays.asList(2, 2, 2);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(8);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_9_is_3_3() {
        List<Integer> expected = Arrays.asList(3, 3);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(9);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_10_is_2_5() {
        List<Integer> expected = Arrays.asList(2, 5);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(10);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_210_is_2_3_5_7 () {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(210);
        assertTrue(checkEquals(actual, expected));
    }

    @Test
    public void prime_factors_of_74_is_2_37 () {
        List<Integer> expected = Arrays.asList(2, 37);
        List<Integer> actual = PrimeFactorsCalculator.getPrimeFactors(74);
        assertTrue(checkEquals(actual, expected));
    }
    
    private boolean checkEquals (List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size()) return false;
        
        for (int i = 0; i < list1.size(); i ++) {
            if (list1.get(i).intValue() != list2.get(i).intValue()) {
                return false;
            }
        }
        return true;
    }
}
