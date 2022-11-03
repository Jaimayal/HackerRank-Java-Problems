package com.jaimayal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static List<Integer> list;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        list = new ArrayList<>(length);
        
        for (int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }
        
        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            scanner.nextLine();
            String type = scanner.nextLine();
            if ("Insert".equals(type)) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                
                list.add(index, value);
            } else if ("Delete".equals(type)) {
                int index = scanner.nextInt();
                
                list.remove(index);
            } else {
                throw new RuntimeException("Invalid query");
            }
        }
        
        list.forEach(elem -> System.out.print(elem + " "));
    }
}