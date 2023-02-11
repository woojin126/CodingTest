package com.company.codingTest;

import java.util.Scanner;

public class FindLetter {
    public static int solution(String str, char t) {
        int answer=0;
        String lowerCase = str.toLowerCase();
        char c = Character.toLowerCase(t);
        for (int i = 0 ; i < lowerCase.length() ;i++) {
            if (lowerCase.charAt(i) == c) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);

        int solution = FindLetter.solution(str, t);
        System.out.println(solution);
    }
}
