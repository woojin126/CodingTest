package com.company.codingTest;

import java.util.HashMap;
import java.util.Map;

public class NumberAndEnglish {
    public int solution(String s) {
        Map<String,String> converter = new HashMap<>();
        converter.put("zero", "0");
        converter.put("one", "1");
        converter.put("two", "2");
        converter.put("three", "3");
        converter.put("four", "4");
        converter.put("five", "5");
        converter.put("six", "6");
        converter.put("seven", "7");
        converter.put("eight", "8");
        converter.put("nine", "9");

        for (String s1 : converter.keySet()) {
            s = s.replace(s1, converter.get(s1));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        NumberAndEnglish n = new NumberAndEnglish();
        String s = new String("one4seven");
        int solution = n.solution(s);
        System.out.println(solution);
    }
}
