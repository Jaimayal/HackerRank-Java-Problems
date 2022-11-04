package com.jaimayal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
    }

    public static boolean isBalanced(String s) {
        if (s.isEmpty()) {
            return true;
        }

        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        
        List<Character> hold = new ArrayList<>();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (pairs.containsKey(c)) {
                hold.add(pairs.get(c));
            } else {
                if (!hold.remove((Character) c)) {
                    return false;
                }
            }
        }

        return hold.isEmpty();
    }
}