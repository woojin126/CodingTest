package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    public static String solution(int a, int b) {
        if (a==b) return "D";

        if (a==1 && b==3) return "A";
        else if (a==2 && b==1) return "A";
        else if (a==3 && b==2) return "A";
        else return "B";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer A = new StringTokenizer(br.readLine());
        StringTokenizer B = new StringTokenizer(br.readLine());

        while (N != 0) {
            N--;
            System.out.println(solution(Integer.parseInt(A.nextToken()),Integer.parseInt(B.nextToken())));
        }

    }
}




