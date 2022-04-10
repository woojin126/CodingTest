package com.company.codingTest;

import java.util.Arrays;

public class DivisibleArrangement {
    public int[] solution(int[] arr, int divisor) {
        long count = Arrays.stream(arr).filter(s -> s % divisor == 0).count();
        if (count == 0)
            return new int[]{-1};

        return Arrays.stream(arr).filter(s -> s % divisor == 0).sorted().toArray();
    }

    public static void main(String[] args) {
        DivisibleArrangement divisibleArrangement = new DivisibleArrangement();
        int[] solution = divisibleArrangement.solution(new int[]{5, 9, 7, 10}, 5);
        System.out.println(Arrays.toString(solution));
    }
}
