package com.company.datastructure;

import java.util.Scanner;

public class BrutoothForce {
    static int bfMath(String txt, String pat) {
        int pt = txt.length() -1;
        int pp = pat.length() -1;
        while(pt >= 0 && pp >= 0){

            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt --;
                pp --;
            } else {
                pt = pt -1;
                pp = pp -1;
            }
        }

        if (pp < 0) // 검색성공
            return pt + 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String next = scan.next();
        String next2 = scan.next();

        int idx = bfMath(next, next2);

        if (idx == -1) System.out.println("꺼져");
        else {
            int len = 0;
            for (int i= 0 ; i< idx; i++)
                len += next.substring(i, i + 1).getBytes().length;
            len += next2.length();

            System.out.println(idx + 1 + "번째 문자부터 일치합니다.");
            System.out.println("텍스트 : " + next);
            System.out.printf(String.format("패턴 : %%%ds\n", len), next2);
        }
    }
}
