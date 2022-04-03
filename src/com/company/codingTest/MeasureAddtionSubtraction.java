package com.company.codingTest;

import java.util.HashMap;
import java.util.Map;


public class MeasureAddtionSubtraction {
    private int plusMinus(Map<Integer, Integer> result) {
        int count = 0;
        for (Integer key : result.keySet()) {
            int value = result.get(key) % 2 == 0 ? key : -key;
            count+=value;
        }
        return count;
    }
    public int solution(int left, int right) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0 ) {
                    int count = result.containsKey(i) ? result.get(i) + 1 : 1;
                    result.put(i, count);
                }
            }
        }
        return plusMinus(result);
    }



    public static void main(String[] args) {
        MeasureAddtionSubtraction measureAddtionSubtraction = new MeasureAddtionSubtraction();
        int solution = measureAddtionSubtraction.solution(13, 17);
        System.out.println(solution);
    }
}