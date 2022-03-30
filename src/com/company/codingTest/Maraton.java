package com.company.codingTest;


import java.util.*;

public class Maraton {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();
        // 참가자의 이름별 명단을 맵에 담음
        for (String p:participant)  {
            if(map.get(p) != null){
                map.put(p, map.get(p) + 1);
            }else{
                map.put(p,1);
            }
        }
        System.out.println(map);
        // 완주자의 리스트 만큼 명단에서 cnt 를 낮춤
        for (String c:completion){
            if(map.get(c) != 0) {
                map.put(c, map.get(c) - 1);
            }
        }
        // map 중 값이 0이 아닌 key 만 answer 에 담음
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                    list.add(key);

            }
        }
        String answer = list.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Maraton maraton = new Maraton();
        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = {"stanko", "ana", "mislav"};
        String solution = maraton.solution(p, c);
        System.out.println(solution);
    }
}
