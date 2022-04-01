package com.company.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FailRate {
    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];

        double[] stage = new double[N+1];

        for(int s : stages) {
            if(s == N+1)
                continue;
            stage[s]++;
        }

        List<Double> list = new ArrayList<>();
        double length = stages.length;
        double num = 0;

        for(int i = 0 ; i < stage.length; i++ ) {
            num = stage[i];
            stage[i] = stage[i] / length;

            length = length - num;
            list.add(stage[i]);
        }
        list.sort(Collections.reverseOrder());

        System.out.println(list);
        System.out.println(Arrays.toString(stage));
        for(int i = 0 ; i < list.size() ; i++) {
            for(int j = 1; j < stage.length ; j++) {
                if(list.get(i) == stage[j]) {
                    answer[i] = j;

                    stage[j] = -1;
                    break;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FailRate failRate = new FailRate();
        int[] solution = failRate.solution(4, new int[]{4,4,4,4,4});
        System.out.println(Arrays.toString(solution));
    }
}
