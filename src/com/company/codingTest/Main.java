package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static ArrayList<Integer> solution(int N) {
        ArrayList<Integer> answer = new ArrayList<>();
        //입력값 역순
        int res = reverseOrder(N);
        //소수판별
        if (isPrime(res)) answer.add(res);
        return answer;

    }

    private static int reverseOrder(int N) {
        int nm;
        int res = 0;
        while (N != 0) {
            nm = N % 10;
            res = res * 10 + nm;
            N = N / 10;
        }
        return res;
    }

    public static boolean isPrime(int p) {
        if (p == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(p); i++) {
            if (p % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            ArrayList<Integer> list = solution(Integer.parseInt(st.nextToken()));
            for (Integer result : list) {
                System.out.print(result + " ");
            }
        }

    }
}



