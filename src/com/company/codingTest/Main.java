package com.company.codingTest;
import java.util.*;

class Main {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 1;
        s = s + " ";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else if (count == 1) {
                answer.append(s.charAt(i));
            } else {
                answer.append(s.charAt(i));
                answer.append(count);
                count = 1;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(solution(s));
    }
}




