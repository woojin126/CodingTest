package com.company.codingTest;

import java.util.Scanner;

public class Satang {

    public static char[][] board;	// 맵 크기
    public static int N;			// 맵 크기
    public static int max = 0;		// 먹을 수 있는 최대 사탕개수
    public static void checkDeleteString() {

        for (int i = 0 ; i < N ; i++) {
            int count = 1;
            for (int j = 0 ; j < N-1 ; j++) {

                if (board[i][j]==(board[i][j + 1]))
                    count ++;
                else
                    count = 1;
                max = Math.max(max, count);
            }
        }


        for (int i = 0 ; i < N ; i++) {
            int count = 1;
            for (int j = 0 ; j < N -1 ; j++) {

                if (board[j][i]==(board[j+1][i]))
                    count++;
                else
                    count = 1;
                max = Math.max(max, count);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        board = new char[N][N];

        for (int i = 0 ; i < N ; i++) {
            String str = scan.next();
            for (int j = 0 ; j < N ; j++) {
                board[i][j] = str.charAt(j);
            }
        }


        for (int i = 0 ; i<N ; i++) {
            for (int j = 0 ; j < N-1 ; j++) {
                char temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;

                checkDeleteString();

                temp = board[i][j+1];
                board[i][j+1] = board[i][j];
                board[i][j] = temp;
            }
        }

        for (int i = 0 ; i < N; i++) {
            for (int j = 0 ; j < N-1 ; j++) {
                char temp = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = temp;

                checkDeleteString();

                temp = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = temp;
            }
        }

        System.out.println(max);
        scan.close();
    }
}
