package com.company.codingTest;

import java.util.Scanner;

public class CaseConversion {

    public static String solution(String str) {
       StringBuilder answer= new StringBuilder();

        for (char x : str.toCharArray()) {
            if (x >= 65 && x <= 90) {
                answer.append((char)(x + 32));
            } else {
                answer.append((char)(x - 32));
            }
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String solution = CaseConversion.solution(str);
        System.out.println(solution);
    }
}
