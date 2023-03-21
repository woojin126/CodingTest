package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main {
    public static int solution(int[] N) {
        int value = 0;
        int sum = 0;
        for (int i = 0; i < N.length ; i++) {
            if (N[i] == 0) {
                sum = 0;
            } else {
                value += ++sum;
            }
        }
        return value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] value = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(value));

    }
}



