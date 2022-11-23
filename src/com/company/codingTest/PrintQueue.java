package com.company.codingTest;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class PrintQueue {

    private static void setting(Scanner sc, int N, LinkedList<int[]> q) {
        for (int j = 0; j < N; j++) {
            q.add(new int[]{j, sc.nextInt()});
        }
    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i=0 ; i<T ; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            LinkedList<int[]> q = new LinkedList<>();
            setting(sc, N, q);

            int count = 0;
            while (true) {
                boolean isMax = true;
                int[] firstValue = q.poll();

                for (int k = 0 ; k < q.size(); k++) {
                    if (firstValue[1] < q.get(k)[1]) {
                        q.offer(firstValue);
                        isMax = false;
                    }
                }

                if (!isMax) continue;

                count++;
                if (M == firstValue[0])
                    break;
            }

            System.out.println(count);
        }
    }

}

