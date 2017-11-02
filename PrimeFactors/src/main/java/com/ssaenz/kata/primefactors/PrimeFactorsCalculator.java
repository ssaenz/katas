package com.ssaenz.kata.primefactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorsCalculator {
	
	private static List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37);

    public static List<Integer> getPrimeFactors(Integer _number) {
        
        List<Integer> factors = new ArrayList<>();
        primeNumbers.forEach(primeNum -> {
            Integer number = new Integer(_number);
            while (number > primeNum && number % primeNum == 0) {
                factors.add(primeNum);
                number = number / primeNum;
            }
            if (number.intValue() == primeNum.intValue()) {
                factors.add(number);
                return;
            }
        });
        return factors;
    }
}
