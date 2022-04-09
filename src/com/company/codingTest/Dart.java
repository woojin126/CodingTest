package com.company.codingTest;

import java.util.Arrays;
public class Dart {
    public int solution(String dartResult) {
        int[] arr = new int[3];
        int count = 0;
        StringBuilder temp = new StringBuilder();
        int value;
        for(int i = 0 ; i < dartResult.length() ; i++) {
            char c = dartResult.charAt(i);
            if('0' <= c && c <= '9'){
                temp.append(c);
            }else if (c == 'S' || c == 'D' || c == 'T') {
                value = Integer.parseInt(String.valueOf(temp));
                if (c == 'S')
                    value = (int)Math.pow(value, 1);
                else if (c == 'D')
                    value = (int)Math.pow(value,  2);
                else
                    value = (int)Math.pow(value, 3);
                arr[count++] = value;
                temp.delete(0, dartResult.length());
            } else {
                if (c == '#') {
                    arr[count-1] = arr[count-1] * -1;
                } else if (c == '*') {
                    arr[count -1] *= 2;
                    if (count -2 >= 0) arr[count -2] *= 2;
                }
            }


        }
        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        Dart dart = new Dart();
        int solution = dart.solution("1D2S3T*");
        System.out.println(solution);

    }
}
