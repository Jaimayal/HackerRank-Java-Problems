package com.jaimayal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Problem
 * Given an array, , of real number strings, sort them in descending order — 
 * but wait, there's more! Each number must be printed in the exact 
 * same format as it was read from stdin, meaning that is printed as , and 
 * is printed as . If two numbers represent numerically equivalent values (e.g.,),
 * then they must be listed in the same order as they were received as input).
 *
 * Complete the code in the unlocked section of the editor below. You must rearrange
 * array's elements according to the instructions above.
 * 
 * Constraints
 * 1 <= N <= 200
 * S has at most 300 digits
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<String> strings = new ArrayList<>();
        
        for (int i = 0; i < count; i++) {
            strings.add(scanner.nextLine());
        }
        
        strings.stream()
                .sorted((s1, s2) -> -(new BigDecimal(s1).compareTo(new BigDecimal(s2))))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}