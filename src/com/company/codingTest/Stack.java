package com.company.codingTest;

import java.io.*;

public class Stack {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        java.util.Stack stack = new java.util.Stack();
        for (int i = 0; i < N; i++) {

            String input = bf.readLine();
            if (input.contains("push")) {
                String[] p = input.split(" ");
                stack.push(p[1]);
            }else if (input.contains("pop")) {
                if (stack.empty()) bw.write(-1+"\n");
                else bw.write(stack.pop()+"\n");
            }else if (input.contains("size")) {
                bw.write(stack.size()+"\n");
            }else if (input.contains("empty")) {
                if (stack.empty()) bw.write(1+"\n");
                else bw.write(0+"\n");
            }else if (input.contains("top")) {
                if (stack.empty()) bw.write(-1+"\n");
                else bw.write(stack.peek()+"\n");
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }

}
