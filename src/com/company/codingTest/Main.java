package com.company.codingTest;

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static int solution(int[][] arr) {

        int max = 0;
        int sum, sum2;
        for (int i = 0 ; i < arr[0].length ; i++) {
            sum=sum2=0;
            for (int j = 0 ; j < arr.length ; j++) {
                sum += arr[i][j];
                sum2 += arr[j][i];
            }

            int bi = Math.max(sum, sum2);
            if (bi > max) max = bi;
        }

        sum=sum2=0;
        for (int i = 0; i < arr[0].length ;i++) {
            sum += arr[i][i];
            sum2 += arr[i][i];
        }
        int answer = Math.max(max, Math.max(sum, sum2));
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N ;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));
    }
}



