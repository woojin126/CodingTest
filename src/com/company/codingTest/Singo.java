package com.company.codingTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//카카오 기출 신고결과 받기
//복습완료
public class Singo {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String,Integer> mail_list = new HashMap<>();
        Map<String,HashSet<String>> people_list=  new HashMap<>();

        for (int i = 0 ; i < id_list.length ; i ++) {
            mail_list.put(id_list[i] , i);
            people_list.put(id_list[i] , new HashSet<>());
        }

        for (int i = 0; i < report.length; i++) {
            String[] people = report[i].split(" ");
            String good = people[0];
            String bad = people[1];

            people_list.get(bad).add(good);
        }

        for (int i = 0 ; i < id_list.length ; i ++) {
            HashSet<String> good = people_list.get(id_list[i]);

            if (good.size() >= k ) {
                for (String s : good) {
                    answer[mail_list.get(s)] ++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Singo main = new Singo();
    }

}
