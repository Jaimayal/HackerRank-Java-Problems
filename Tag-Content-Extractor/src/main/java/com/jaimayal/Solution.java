package com.jaimayal;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem Constraints
 * 1 <= N <= 100
 * Each line 10^4 max chars
 * Total number of chars <= 10^6
 */
public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            boolean hasValidContent = false;
            Matcher startMatcher = Pattern.compile("<[^<]+>").matcher(line);
            
            while (startMatcher.find()) {
                String tag = startMatcher.group();
                Matcher endMatcher = Pattern.compile(Pattern.quote("</" + tag.substring(1))).matcher(line);
                
                while (endMatcher.find()) {
                    String matcherLine = line.substring(startMatcher.end(), endMatcher.start());
                    if (!matcherLine.contains("<")) {
                        if (!matcherLine.isEmpty()) {
                            hasValidContent = true;
                            System.out.println(matcherLine);
                        }
                    }
                }
            }
            
            if (!hasValidContent) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}