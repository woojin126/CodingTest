package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 백준 실버 4 괄호
public class Ghwalho {

    public static String calculate(String N) throws IOException {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '(') stack.push(N.charAt(i));
            else if (stack.empty()) return "NO";
            else stack.pop();
        }

        if (stack.empty()) return "YES";
        else return "NO";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0 ; i < T; i++) {
            String results = calculate(bf.readLine());

            System.out.println(results);
        }
    }

}

