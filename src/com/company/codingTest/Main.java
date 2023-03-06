package com.company.codingTest;
import java.util.*;
class Main {
    public int[] solution(String s, char t){
        int[] arr = new int[s.length()];

        int defaultValue = 1000;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == t) {
                defaultValue = 0;
                arr[i] = defaultValue;
            } else {
                defaultValue++;
                arr[i] = defaultValue;
            }
        }

        defaultValue = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) defaultValue = 0;
            else {
                defaultValue++;
                arr[i] = Math.min(arr[i], defaultValue);
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String[] s = kb.nextLine().split(" ");
       for (int x : T.solution(s[0], s[1].charAt(0))) {
           System.out.print(x+" ");
       }
    }
}




