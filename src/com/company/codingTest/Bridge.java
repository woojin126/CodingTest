package com.company.codingTest;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bridge {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = 0;

        for (int i = 0; i < total; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            LinkedList<int[]> queue = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, sc.nextInt()});
            }

            while (true) {
                boolean print = true;
                int[] getElement = queue.poll();

                for (int j = 0; j < queue.size(); j++) {
                    if (getElement[1] < queue.get(j)[1]) {
                        print = false;
                        break;
                    }
                }

                if (print) {
                    count++;
                    queue.remove(0);
                    if (getElement[0] == M) System.out.println(count);
                } else {
                    queue.add(getElement);
                    queue.remove(0);
                }
            }
        }
        System.out.println(count);

    }
}
