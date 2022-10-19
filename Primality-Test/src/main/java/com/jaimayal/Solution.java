package com.jaimayal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Problem
 * A prime number is a natural number greater than 1 whose only positive 
 * divisors are 1 and itself. For example, the first six prime numbers are 
 * 2, 3, 5, 7, 11, and 13.
 *
 * Given a large integer, use the Java BigInteger class' 
 * isProbablePrime method to determine and print whether 
 * it's prime or not prime.
 * 
 * Constraints
 * n < 100 digits
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        System.out.println(new BigInteger(n).isProbablePrime(1) ? "prime" : "not prime");
        bufferedReader.close();
    }
}