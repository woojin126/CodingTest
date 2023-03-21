package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main {
    public static int[] solution(int[] N) {
        int[] answer = new int[N.length];
        for (int i=0 ; i<N.length ; i++) {
            int grade=N.length;
            for (int j=0; j<N.length ; j++) {
                if (i==j) continue;
                if (N[i] >= N[j]) grade--;
            }

            answer[i] = grade;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] value = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        int[] solution = solution(value);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}



