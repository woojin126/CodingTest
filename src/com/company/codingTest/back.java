package com.company.codingTest;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class back {

    public static void main(String[] args) throws IOException {

        //10 14 20 25 30
        //1  2  4  8  16
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] indexCount = new int[n];
        int[] cost = new int[n];

        for (int i = 0 ; i < n ; i++) {
            cost[i] = sc.nextInt();
            indexCount[i] = (int) Math.pow(2, i);
        }

        int[] sortedList= Arrays.stream(cost).sorted().toArray();
        for (int i = 0 ; i < sortedList.length ; i ++) {
            
        }

    }
}
