package com.company.codingTest;

import java.util.Arrays;
import java.util.HashMap;

/*
* 1. 먼저 처음에 눌린값을 변수에 지정
* 2. 다음 키를누를때 변수에 저장한 전값 가져와서 사용
* 3. 중앙에 있는 2,5,8,10 은 왼쪾라인, 오른쪽라인에 가까운 쪽으로 가야하니 거리 계산필요
* 복습완료
* */

//카카오 키패드 누르기
public class KeyPad {

    public String solution(int[] numbers, String hand) {

        StringBuilder answer = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int num : numbers) {
            switch (num) {
                case 1 : case 4 : case 7 : {
                    answer.append("L");
                    left = num;
                    break;
                }
                case 3 : case 6 : case 9 : {
                    answer.append("R");
                    right = num;
                    break;
                }
                default: {
                    if (num == 0) num = 11;
                    int minLeft = left > num ? left - num : num - left;
                    int minRight = right > num ? right - num : num - right;

                    int distanceL = (minLeft % 3) + (minLeft / 3);
                    int distanceR = (minRight % 3) + (minRight / 3);

                    if (distanceL > distanceR) {
                        answer.append("R");
                        right = num;
                        break;
                    } else if(distanceR> distanceL) {
                        answer.append("L");
                        left = num;
                        break;
                    } else {
                        if (hand.equals("right")) {
                            answer.append("R");
                            right = num;
                        }else {
                            answer.append("L");
                            left = num;
                        }
                    }
                }

            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        KeyPad keyPad = new KeyPad();
        String result = keyPad.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        System.out.println(result);
    }
}
