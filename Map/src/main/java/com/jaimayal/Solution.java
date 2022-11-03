package com.jaimayal;//Complete this code or write your own from scratch
import java.util.*;

class Solution{
    private static Map<String, Integer> phonebook;
    public static void main(String []argh) {
        phonebook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        
        for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            
            phonebook.put(name, phone);
        }
        
        while(in.hasNext()) {
            String s=in.nextLine();

            Integer cellphone = phonebook.get(s);
            if (cellphone == null) {
                System.out.println("Not found");
                continue;
            }

            System.out.printf("%s=%d\n", s, cellphone);
        }
    }
}



