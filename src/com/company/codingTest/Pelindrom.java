package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pelindrom {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String N = bf.readLine();
            boolean check = true;

            if (N.equals("0")) break;

            for (int i = 0; i < N.length() / 2; i++) {
                if (N.charAt(i) == N.charAt(N.length() -1 - i)) check = true;
                else check = false;
            }

            if (check) System.out.println("yes");
            else System.out.println("no");


        }
    }

}
