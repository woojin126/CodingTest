package com.company.codingTest;

import java.io.IOException;
import java.util.Scanner;


public class Confetti {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] cardition = new boolean[101][101];

        int count = 0 ;
        for (int i = 0 ; i < N ; i ++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int k = x; k < x+10 ; k++) {
                for (int j = y; j < y+10 ; j++) {
                    if (cardition[k][j])
                        continue;

                    cardition[k][j] = true;
                    count ++;
                }
            }


        }
        System.out.println(count);

    }

}
