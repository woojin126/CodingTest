package com.company.codingTest;

import java.util.Arrays;


public class yesan {

    public int solution(int[] d, int budget) {


        Arrays.sort(d);
        int count = 0;
        for (int i = 0 ; i < d.length ; i++) {
            budget -= d[i];

            if (budget < 0 )
                break;

            count ++;
        }

        return count;
    }

    public static void main(String[] args) {
        yesan yesan = new yesan();
        int solution = yesan.solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println(solution);

    }
}
