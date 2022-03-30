package com.company.codingTest;
import java.util.HashSet;

public class HealthCloth {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        HashSet<Integer> l = new HashSet<>();
        HashSet<Integer> r = new HashSet<>();

        for(int ra : reserve)
            r.add(ra);

        for(int la : lost)
            l.add(la);

        for(int la : lost) {
            if(r.contains(la-1))
                r.remove(la-1);
            else if(r.contains(la+1))
                r.remove(la+1);
            else answer--;
        }

        return answer;
    }

    public static void main(String[] args) {
        HealthCloth healthCloth = new HealthCloth();
        int solution = healthCloth.solution(5, new int[]{3}, new int[]{1});
        System.out.println(solution);
    }
}
