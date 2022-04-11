package com.company.codingTest;

import java.util.Arrays;

public class XdistanceNCount {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        while(n > 0) {
            answer[n-1] = (long) x * n;
            n--;
        }

        return answer;
    }

    public static void main(String[] args) {
        XdistanceNCount xdistanceNCount = new XdistanceNCount();
        long[] solution = xdistanceNCount.solution(2, 5);
        System.out.println(Arrays.toString(solution));
    }
}
