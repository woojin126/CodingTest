package com.company.codingTest;

import java.util.*;


public class FailRate {
    public static List<Integer> sortByValue(final Map<Integer,Double> map) {
        List<Integer> list = new ArrayList();
        list.addAll(map.keySet());
        Collections.sort(list, (Comparator) (o1, o2) -> {
            Object v1 = map.get(o1);
            Object v2 = map.get(o2);
            System.out.println(((Comparable)v2).compareTo(v1));
            return ((Comparable) v2).compareTo(v1);
        });
        return list;
    }
    public int[] solution(int N, int[] stages) {
        double length = stages.length;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer,Double> rate = new HashMap<>();
        for (int stage : stages) {
            int count = map.containsKey(stage) ? map.get(stage) + 1 : 1;
            map.put(stage, count);
        }
        for (int i = 1 ; i < N+1 ; i++) {
            if (map.containsKey(i)) {
                double failRate = map.get(i) / length;
                length = length - map.get(i);
                rate.put(i,failRate);
            } else {
                rate.put(i, 0.0);
            }
        }
        List<Integer> list = sortByValue(rate);
        System.out.println(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        FailRate failRate = new FailRate();
        int[] solution = failRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        System.out.println(Arrays.toString(solution));
    }
}
