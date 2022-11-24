package com.company.codingTest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 다미네집 번호 부여하기
public class Damine {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String N = bf.readLine();
        int[] list = new int[10];


        for (char c : N.toCharArray()) {
            int num = c -'0';

            if (num == 9) {
                num = 6;
            }

            list[num]++;
        }

        if (list[6] % 2 == 1) list[6] ++;
        list[6] = list[6] / 2 ;


        int i = Arrays.stream(list).max().orElseThrow();

        System.out.println(i);



    }

}

