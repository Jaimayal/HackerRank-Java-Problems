package com.jaimayal;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int negativeSubarrays = getNegativeSubarrays(arr);
        System.out.println(negativeSubarrays);
    }
    
    public static int getArraySum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
    
    public static int getNegativeSubarrays(int[] originalArr) {
        int total = 0;
        
        for (int i = 0; i < originalArr.length; i++) {
            for (int j = i; j < originalArr.length; j++) {
                int[] subarr = Arrays.copyOfRange(originalArr, i, j + 1);
                if (getArraySum(subarr) < 0) {
                    total++;
                }
            }
        }
        
        return total;
    }
}
