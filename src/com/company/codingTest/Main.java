package com.company.codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//로또의 최고 순위와 최저 순위
public class Main {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int zeroCount = 0;
        for(int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }

        //same;
        long count = Arrays.stream(win_nums).filter(win -> map.containsKey(win)).count();
        int sameCount = (int) count;
        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if (maxRank > 6 ) maxRank = 6;
        if (minRank > 6) minRank = 6;


        return new int[]{maxRank,minRank};
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] lottos = {31, 45, 0, 0, 0, 0};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] solution = main.solution(lottos, win_nums);
        System.out.println(Arrays.toString(solution));
    }
}
