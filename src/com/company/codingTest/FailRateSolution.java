package com.company.codingTest;

import java.util.Arrays;

public class FailRateSolution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] fail = new Double[N];
        for(int stage : stages) {
            if(stage == N+1)
                continue;
            answer[stage -1]++;
        }
        System.out.println(Arrays.toString(answer));
        double length = stages.length;
        for(int i = 0 ; i < N ; i++) {
            int tmp = answer[i];
            fail[i] = answer[i] / length;
            length -= tmp;

            answer[i] = i+1;
        }
        double tmpF = 0;
        int tmpA = 0;
        for(int i=0 ; i < N ; i++) {
            for (int j=1 ; j < N-i ; j++) {
                if (fail[j-1] < fail[j]) {
                    tmpF = fail[j-1];
                    fail[j-1] = fail[j];
                    fail[j] = tmpF;

                    tmpA = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = tmpA;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FailRateSolution failRate = new FailRateSolution();
        int[] solution = failRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        System.out.println(Arrays.toString(solution));
    }
}
