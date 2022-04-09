package com.company.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdonotLikeSameNumber {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < arr.length -1 ;i++) {
            for (int j = i+1 ; j < i+2 ;j++) {
                if (arr[i] != arr[j])
                    list.add(arr[i]);
            }
        }
        list.add(arr[arr.length-1]);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        IdonotLikeSameNumber idonotLikeSameNumber = new IdonotLikeSameNumber();
        int[] solution = idonotLikeSameNumber.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(solution));
    }
}
