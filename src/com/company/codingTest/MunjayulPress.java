package com.company.codingTest;

public class MunjayulPress {
    public int solution(String s){

        StringBuilder tmp = new StringBuilder();
        for (int i = 0 ; i < s.length() / 2 ;i++) {
            tmp.append(s.charAt(i));
        }

        System.out.println(tmp.toString());
        return 1;
    }

    public static void main(String[] args) {
        MunjayulPress munjayulPress = new MunjayulPress();
        int aabbaccc = munjayulPress.solution("aabbaccc");
        System.out.println(aabbaccc);
    }
}
