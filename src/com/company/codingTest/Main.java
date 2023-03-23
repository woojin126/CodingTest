package com.company.codingTest;

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static int solution(int[][] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N + 2][N + 2];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int solution = solution(arr);
        System.out.println(solution);

    }
}



