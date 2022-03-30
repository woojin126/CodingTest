package com.company.codingTest;
import java.util.HashSet;

public class HealthCloth {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        HashSet<Integer> ko = new HashSet<>();

        for (int r : reserve)
            ko.add(r);

        for (int i=0 ; i< lost.length ;i++) {
            if (ko.contains(lost[i]))
                ko.remove(lost[i]);
            else if(ko.contains(lost[i]-1))
                ko.remove(lost[i]-1);
            else if (ko.contains(lost[i]+1))
                ko.remove(lost[i]+1);
            else answer --;
        }
        return answer;
    }

    public static void main(String[] args) {
        HealthCloth healthCloth = new HealthCloth();
        int solution = healthCloth.solution(5, new int[]{2,4}, new int[]{1,3,5});
        System.out.println(solution);
    }
}
