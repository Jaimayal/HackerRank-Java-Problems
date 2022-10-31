package com.jaimayal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        System.out.println(getMaxSumOfHourglass(arr));
        bufferedReader.close();
    }
    
    public static int getMaxSumOfHourglass(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < arr.size() - 1; i++) {
            List<List<Integer>> reducedArr = arr.subList(i - 1, i + 2);
            
            for (int j = 1; j < arr.get(i).size() - 1; j++) {
                List<List<Integer>> copy = new ArrayList<>(reducedArr);
                
                for (int k = 0; k < copy.size(); k++) {
                    List<Integer> reducedList = copy.get(k).subList(j - 1, j + 2);
                    copy.set(k, reducedList);
                }
                
                
                int hourglassSum = getHourglassSum(copy);
                maxSum = Math.max(hourglassSum, maxSum);
            }
        }
        
        return maxSum;
    }
    
    public static int getHourglassSum(List<List<Integer>> threeByThreeList) {
        Integer sum = 0;
        
        sum += threeByThreeList.get(0).get(0);
        sum += threeByThreeList.get(0).get(1);
        sum += threeByThreeList.get(0).get(2);
        sum += threeByThreeList.get(1).get(1);
        sum += threeByThreeList.get(2).get(0);
        sum += threeByThreeList.get(2).get(1);
        sum += threeByThreeList.get(2).get(2);
        
        return sum;
    }
}