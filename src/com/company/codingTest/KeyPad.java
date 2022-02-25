package com.company.codingTest;

import java.util.Arrays;
import java.util.HashMap;

/*
* 1. 먼저 처음에 눌린값을 변수에 지정
* 2. 다음 키를누를때 변수에 저장한 전값 가져와서 사용
* 3. 중앙에 있는 2,5,8,10 은 왼쪾라인, 오른쪽라인에 가까운 쪽으로 가야하니 거리 계산필요
* */

//카카오 키패드 누르기
public class KeyPad {

    public String solution(int[] numbers, String hand) {

        StringBuilder answer = new StringBuilder();
        int left = 10;
        int right = 12;
        for (int num : numbers) {
            if (num == 0 ) num = 11;

            switch (num % 3) {
                case 0 : {
                    answer.append("R");
                    right = num;
                    break;
                }

                case 1 : {
                    answer.append("L");
                    left = num;
                    break;
                }

                case 2 : {
                    int leftMin = num > left ?  num - left :left - num ;
                    int rightMin = num > right ?  num - right: right - num ;

                    int distanceR = (rightMin % 3 ) + (rightMin / 3);
                    int distanceL = (leftMin % 3 ) + ( leftMin / 3 );

                    if (distanceR > distanceL) {
                        answer.append("L");
                        left = num;
                    }else if (distanceR < distanceL){
                        answer.append("R");
                        right = num;
                    }else {
                        answer.append(hand.equals("right") ? "R" : "L");
                        if (hand.equals("right")) right = num;
                        else left = num;
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        KeyPad keyPad = new KeyPad();
        String result = keyPad.solution(new int[]{1, 3, 4, 5, 8, 2, 4, 5, 9, 5}, "right");
        System.out.println(result);
    }
}
