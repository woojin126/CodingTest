package com.company.codingTest;
import java.util.*;
class Main {
    public String solution(String s){
        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}
/*

public class Main {

    public static char[] isAlpabet(char[] c) {
        StringBuilder answer = new StringBuilder();
        for (char k : c) {
            if (((k >= 'A' && k <= 'Z') || (k >= 'a' && k <= 'z'))) {
                answer.append(k);
            }
        }
        return answer.toString().toCharArray();
    }

    public static boolean isContains(char[] a, char b) {
        String s = String.valueOf(a);
        return s.contains(String.valueOf(b));
    }

    public static boolean lengthCheck(char[] a, char[] b) {
        return a.length != b.length;
    }
    public static String solution(String s) {
        String l = s.toLowerCase();
        String[] arr = l.split(" ");
        String answer = "";
        for (int i = 0; i < arr.length / 2; i++) {
            boolean isBoolean = true;
            char[] k = arr[i].toCharArray();
            char[] v = arr[arr.length -1 -i].toCharArray();

            //알파벳이 아닌것들은 삭제하는 메서드
            char[] alpabet = isAlpabet(k);
            char[] alpabet2 = isAlpabet(v);

            //길이가다르면 애초에 NO 체크
            if (lengthCheck(alpabet,alpabet2)) {
                isBoolean = true;
                answer = "NO";
                break;
            }
            //이제 각각 의 단어가 포함되는지 여부 판단
            for (int j = 0; j < alpabet2.length; j++) {
                if (isContains(alpabet, alpabet2[alpabet2.length -1 -j])) {
                    isBoolean = false;
                    answer = "YES";
                }
                else {
                    isBoolean = true;
                    answer = "NO";
                }

            }

            if (isBoolean) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String result = solution(text);
        System.out.println(result);
    }
}


*/
