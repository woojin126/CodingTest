package com.company.codingTest;


import java.util.Arrays;
import java.util.List;

public class Maraton {
    public String solution(String[] p, String[] c) {

        Arrays.sort(p);
        Arrays.sort(c);
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(c));

        for (int i = 0 ; i < c.length; i++) {
            if (!p[i].equals(c[i])) {
                return p[i];
            }

        }
        return p[p.length -1 ];

    }

    public static void main(String[] args) {
        Maraton maraton = new Maraton();
        String[] p = {"leo","kiki","eden"};
        String[] c = {"eden","kiki"};
        String solution = maraton.solution(p, c);
        System.out.println(solution);
    }
}
