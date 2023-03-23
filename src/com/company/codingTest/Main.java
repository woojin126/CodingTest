package com.company.codingTest;

import java.io.IOException;
import java.util.Scanner;

class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int solution(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = dx[k] + i;
                    int ny = dy[k] + j;

                    if (nx >= 0 && nx < arr[0].length && ny >= 0 && ny < arr[0].length && arr[nx][ny] > arr[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) count++;
            }
        }
        return count;
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



