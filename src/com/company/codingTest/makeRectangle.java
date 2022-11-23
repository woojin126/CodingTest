package com.company.codingTest;

import java.io.IOException;
import java.util.Scanner;

public class makeRectangle {
    public static int NeedValueCalculate(int one, int two, int three) {
        if (one != two && one != three)
            return one;
        else if (two != one)
            return two;
        else return three;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] one = {sc.nextInt(), sc.nextInt()};
        int[] two = {sc.nextInt(), sc.nextInt()};
        int[] three = {sc.nextInt(), sc.nextInt()};

        int x = NeedValueCalculate(one[0], two[0], three[0]);
        int y = NeedValueCalculate(one[1], two[1], three[1]);

        System.out.println(x+" "+y);

    }
}
