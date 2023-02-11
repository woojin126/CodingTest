package com.company.datastructure;

import java.io.*;
import java.util.StringTokenizer;

public class yunyear {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bf.readLine();
        int inputBox = Integer.parseInt(input);

        StringTokenizer st;
        for (int i = 0 ; i < inputBox ; i++) {

            st = new StringTokenizer(bf.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int banLengthSum = r1 + r2;
            int twoPointLength = 0;
            if (x1>x2 && y1>y2) {
                int pow = (int) Math.pow(x1 - x2, 2);
                int pow2 = (int) Math.pow(y1-y2, 2);
                twoPointLength = (int)(Math.sqrt(pow+pow2));
            } else if (x1>x2 && y2>y1) {
                int pow = (int) Math.pow(x1 - x2, 2);
                int pow2 = (int) Math.pow(y2 - y1, 2);
                twoPointLength = (int)(Math.sqrt(pow+pow2));
            } else if (x2>x1 && y1>y2) {
                int pow = (int) Math.pow(x2 - x1, 2);
                int pow2 = (int) Math.pow(y1-y2, 2);
                twoPointLength = (int)(Math.sqrt(pow+pow2));
            } else if (x2>x1 && y2>y1){
                int pow = (int) Math.pow(x2 - x1, 2);
                int pow2 = (int) Math.pow(y2 - y1, 2);
                twoPointLength = (int)(Math.sqrt(pow+pow2));
            } else if (x1==x2 && y1==y2){
                twoPointLength = -1;
            }

            if (twoPointLength - banLengthSum > 0)
                bw.write("0");
            else if (twoPointLength - banLengthSum < 0)
                bw.write("2");
            else if (twoPointLength - banLengthSum == 0)
                bw.write("1");
            else bw.write("-1");

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
