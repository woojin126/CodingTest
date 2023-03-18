package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static int solution(int N) {
        int[] arr = new int[N+1];

        for (int i = 2 ; i <= N ; i++) {
            arr[i] = i;
        }
        for (int i = 2 ; i <= N ; i++) {
            if (arr[i] == 0) continue;

            for (int j = i*2 ; j <= N ; j+=i) {
                arr[j] = 0;
            }
        }

        return (int) Arrays.stream(arr).filter(k -> k != 0).count();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }
}




