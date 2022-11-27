package com.company.codingTest;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0 ; i < N ; i ++) {
            int v = sc.nextInt();

            arr[i] = v;
        }
        Arrays.sort(arr);

        int M = sc.nextInt();
        for (int j = 0 ; j < M; j++) {
           if (findBinarySearch(arr,sc.nextInt())) sb.append(1+"\n");
           else sb.append(0+"\n");
        }

    }

    private static boolean findBinarySearch(int[] arr, int value) {
        int firstIndex = 0;
        int lastIndex = arr.length -1;

        while (firstIndex <= lastIndex) {

            int mid = (firstIndex + lastIndex) / 2;

            if (value > arr[mid]) {
                firstIndex = mid + 1;
            } else if (value < arr[mid]) {
                lastIndex = mid - 1;
            } else return true;
        }

        return false;
    }

}
