package com.company.codingTest;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String reverseString(String name) {
        String answer = "";
        int firstIndex = 0;
        int lastIndex = name.length()-1;
        char[] s = name.toCharArray();
        while (firstIndex < lastIndex) {
            if (!((s[firstIndex] >= 'A' && s[firstIndex] <= 'Z') || (s[firstIndex] >= 'a' && s[firstIndex] <= 'z'))) firstIndex++;
            else if (!((s[lastIndex] >= 'A' && s[lastIndex] <= 'Z') || (s[lastIndex] >= 'a' && s[lastIndex] <= 'z'))) lastIndex--;
            else {
                char tmp = s[firstIndex];
                s[firstIndex] = s[lastIndex];
                s[lastIndex] = tmp;
                firstIndex++;
                lastIndex--;
            }

            answer =  String.valueOf(s);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println(reverseString(text));
    }
}
