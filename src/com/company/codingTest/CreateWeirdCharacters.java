package com.company.codingTest;

import java.util.Locale;

public class CreateWeirdCharacters {
    public String solution(String s) {

        String answer = "";

        StringBuilder sb = new StringBuilder();

        String a = "";
        int tmpIdx = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == ' ') {
                sb.append(a).append(s.charAt(i));
                tmpIdx = 0;
            } else {
                if(tmpIdx%2 == 0) {
                    sb.append(a).append(String.valueOf(s.toUpperCase().charAt(i)));
                } else {
                    sb.append(a).append(String.valueOf(s.toLowerCase().charAt(i)));
                }
                tmpIdx++;
            }
        }
        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        CreateWeirdCharacters createWeirdCharacters = new CreateWeirdCharacters();
        String try_hello_world = createWeirdCharacters.solution("try hello world");
        System.out.println(try_hello_world);
    }
}
