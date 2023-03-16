package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static int solution(int N) {
        Boolean[] tf = new Boolean[N+1];;
        tf[0] = true;
        tf[1] = true;
        for (int i = 2; i < N ; i++) {
            if (tf[i]) {
                for (int j=i; j<=N; j=j+i) tf[j]=false;
            }
        }
        int answer = 0;
        for (int i = 0 ; i < N ; i ++) {
            if (tf[i]) answer++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }
}




