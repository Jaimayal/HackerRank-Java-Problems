package com.jaimayal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * The code in your editor does the following:
 * 1. Reads an integer from stdin and saves it to a variable, n, 
 * denoting some number of integers.
 * 2. Reads n integers corresponding to from stdin and saves each integer 
 * to a variable val.
 * 3. Attempts to print each element of an array of integers named a.
 *
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        
        scan.close();
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}