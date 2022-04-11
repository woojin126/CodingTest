package com.company.codingTest;

import java.util.Arrays;

public class RowAndColumnPlus {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[0].length ; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RowAndColumnPlus rowAndColumnPlus = new RowAndColumnPlus();
        int[][] solution = rowAndColumnPlus.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}});
        System.out.println(Arrays.deepToString(solution));

    }
    }
