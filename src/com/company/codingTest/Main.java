package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static int reverseOrder(int N) {
        int t = N;
        int nm;
        StringBuilder answer = new StringBuilder();
        while (t != 0) {
            nm = t % 10;
            t = t/10;

            answer.append(nm);
        }

        return Integer.parseInt(String.valueOf(answer));

    }

    public static boolean isPrime(int p) {
        if (p == 1) return false;
        for (int i = 2; i<= (int)Math.sqrt(p) ; i++) {
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
        StringBuilder answer = new StringBuilder();
        while (st.hasMoreTokens()) {
            //역순처리
            int solution = reverseOrder(Integer.parseInt(st.nextToken()));
            //소수판별
            if (isPrime(solution)) {
                answer.append(solution);
                answer.append(" ");
            }
        }
        System.out.println(answer);
    }
}




