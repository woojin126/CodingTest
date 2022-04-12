package com.company.codingTest;


public class HashadCount {
    public int[] solution(long n) {

        String result = String.valueOf(n);
        int[] answer = new int[result.length()];
        char[] v = result.toCharArray();
        int count = 0;
        for(int i = v.length -1 ; i >= 0; i--) {
            answer[count++] = Integer.parseInt(String.valueOf(v[i]));
        }
        return answer;
    }

    public static void main(String[] args) {
        HashadCount h = new HashadCount();
        h.solution(12345);
    }
}
