package com.company.codingTest;
import java.util.*;
class Main {
    public static String solution(int[] a, int[] b) {
        String answer = "";
        for (int i = 0 ; i < a.length ;i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        //꼮 이렇게 초기값 셋팅을 해야하는지? 생각이 더필요
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println(solution(A,B));


    }
}




