package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static int[] solution(int N) {
        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2 ; i < N ; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] solution = solution(N);

        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}




