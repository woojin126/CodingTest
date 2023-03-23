package com.company.codingTest;

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static int solution(int[][] arr) {
        int max = 0;
        int studentNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                studentNumber = i + 1;
            }
        }
        return studentNumber;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int solution = solution(arr);
        System.out.println(solution);

    }
}



