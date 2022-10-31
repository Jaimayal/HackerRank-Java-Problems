package com.jaimayal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            int listLength = scanner.nextInt();
            List<Integer> integers = new ArrayList<>(listLength);

            for (int j = 0; j < listLength; j++) {
                integers.add(scanner.nextInt());
            }
            
            lists.add(integers);
        }
        
        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                System.out.println(lists.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}