package com.company.codingTest;
import java.util.*;

class Main {
        public static String solution(String s, int n) {
            String answer = "";
            for (int i = 0 ; i < n ; i++) {
                String value = s.substring(0, 7).replace('#', '1').replace('*', '0');

                int count = 0;
                int sum = 0;
                //십진수 변환
                for (int j=value.length()-1; j >= 0 ;j--) {
                    sum += Integer.parseInt(String.valueOf(value.charAt(j))) * Math.pow(2, count);
                    count++;
                }

                answer += (char)sum;
                s = s.substring(7);

            }
            return answer;
        }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        String s = kb.next();
        System.out.println(solution(s,a));
    }
}




