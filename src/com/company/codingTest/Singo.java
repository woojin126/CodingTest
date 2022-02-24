package com.company.codingTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//카카오 기출 신고결과 받기
public class Singo {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reports = new HashMap<>();
        Map<String, Integer> mail_count = new HashMap<>();

        //초기 셋팅
        for (int i = 0; i < answer.length; i++) {
            mail_count.put(id_list[i], i);
            reports.put(id_list[i], new HashSet<>());
        }

        //신고 한사람 신고 당한사람
        for (int i = 0; i < report.length; i++) {
            String[] data = report[i].split(" ");
            String from = data[0]; //신고한 사람
            String to = data[1]; //신고 당한 사람
            reports.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {

            HashSet<String> froms = reports.get(id_list[i]);
            if (froms.size() >= k) {
                for (String s : froms)
                    answer[mail_count.get(s)]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Singo main = new Singo();
    }

}
