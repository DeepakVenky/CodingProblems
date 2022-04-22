package com.coding.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
    static int patternCount(String s) {
        Pattern pattern = Pattern.compile("(?<=1)[0]+(?=1)");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find())
            count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(patternCount("1000012341001"));
    }
}
