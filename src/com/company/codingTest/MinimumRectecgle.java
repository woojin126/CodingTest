package com.company.codingTest;

import java.util.Arrays;

public class MinimumRectecgle {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length ; i++){
            Arrays.sort(sizes[i]);
        }

        System.out.println(Arrays.deepToString(sizes));

        int max1 = 0;
        int max2 = 0;

        for(int i = 0; i<sizes.length ; i++){
            max1 = (sizes[i][0] > max1) ? sizes[i][0] : max1;
            max2 = (sizes[i][1] > max2) ? sizes[i][1] : max2;
        }

        int answer = max1*max2;
        return answer;
    }

    public static void main(String[] args) {

        MinimumRectecgle minimumRectecgle = new MinimumRectecgle();
        int solution = minimumRectecgle.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println(solution);
    }
}
