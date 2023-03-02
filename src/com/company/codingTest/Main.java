package com.company.codingTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static String removeDuplicate(String name) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        char[] s = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (!list.contains(s[i])) {
                answer.append(s[i]);
            }
            list.add(s[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String s = removeDuplicate(text);
        System.out.println(s);
    }
}
