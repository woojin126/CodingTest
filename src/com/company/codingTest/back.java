package com.company.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back {

    Boolean checkLength(int keywordLength) {
        return keywordLength > 50;
    }

    String checkKeyword(String keyword) {
        return keyword.concat("??!");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine().toLowerCase();
        back b = new back();
        if (!b.checkLength(str.length()))
            b.checkKeyword(str);
    }
}
