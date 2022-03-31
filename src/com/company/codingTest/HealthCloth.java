package com.company.codingTest;


import java.util.HashSet;

public class HealthCloth {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        HashSet<Integer> set = new HashSet<>();
        for(int r : reserve)
            set.add(r);

        for(int i = 0 ; i < lost.length ; i++) {
            if(set.contains(lost[i])) {
                set.remove(lost[i]);
                answer++;
                lost[i] = -1;
            }
        }

        for (int i =0 ; i < lost.length ; i++) {
            if (set.contains(lost[i] -1)) {
                answer++;
                set.remove(lost[i] -1);
            }else if (set.contains(lost[i] +1)) {
                answer++;
                set.remove(lost[i] +1);
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        HealthCloth healthCloth = new HealthCloth();
        int solution = healthCloth.solution(3, new int[]{3}, new int[]{1});
        System.out.println(solution);
    }
}
