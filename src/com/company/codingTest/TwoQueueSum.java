package com.company.codingTest;


import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;
        for (int j : queue1) {
            sum1 += j;
            que1.offer(j);
        }

        for (int j : queue2) {
            sum2 += j;
            que2.offer(j);
        }

        Integer count = calculate(queue1, queue2, que1, que2, sum1, sum2);
        if (count == null) return -1;


        return count;
    }

    private Integer calculate(int[] queue1, int[] queue2, Queue<Integer> que1, Queue<Integer> que2, long sum1, long sum2) {
        int count = 0;
        while (sum1 != sum2) {
            count++;

            if (sum1 > sum2) {
                Integer value = que1.poll();
                sum1 -= value;
                sum2 += value;
                que2.offer(value);
            }

            else {
                Integer value = que2.poll();
                sum1 += value;
                sum2 -= value;
                que1.offer(value);
            }

            if (count > (queue1.length * (queue2.length -1)) ) return null;
        }
        return count;
    }


}

public class TwoQueueSum {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2};
        int[] arr2 = {1,10,1,2};

        Solution solution = new Solution();
        int solution1 = solution.solution(arr, arr2);
        System.out.println(solution1);
    }
}
