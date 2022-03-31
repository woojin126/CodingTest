package com.company.codingTest;
import java.util.Arrays;
import java.util.stream.Collectors;

public class poketmon {
    public int solution(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.collectingAndThen(Collectors.toSet(), s -> Math.min(s.size(), nums.length / 2)));

    }


    public static void main(String[] args) {
        poketmon poketmon = new poketmon();

        int solution = poketmon.solution(new int[]{3,3,3,2,2,4});
        System.out.println(solution);
    }
}
