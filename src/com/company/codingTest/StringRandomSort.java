package com.company.codingTest;

import java.util.*;


public class StringRandomSort {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) return 1;
                else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                else return -1;
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        StringRandomSort stringRandomSort = new StringRandomSort();
        String[] solution = stringRandomSort.solution(new String[]{"abce", "abcd", "cdx"}, 2);
        System.out.println(Arrays.toString(solution));
    }
}
