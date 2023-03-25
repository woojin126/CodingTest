package com.company.codingTest;

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static int solution(int[][] arr, int N, int M) {
        int answer = 0;
        for (int i=1;i<=N;i++) {
            for (int j=1;j<=N;j++) {
                if (i==j) continue;

                int cnt = 0;
                for (int m=0;m<M;m++) {
                    int pi=0; int pj=0;
                    for (int g=0;g<N;g++) {
                        if (arr[m][g] == i) pi = g;
                        else if (arr[m][g] == j) pj = g;
                    }

                    if (pi < pj) cnt++;
                }
                if (cnt == arr.length)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int solution = solution(arr,N,M);
        System.out.println(solution);

    }
}



