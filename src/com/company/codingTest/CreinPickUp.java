package com.company.codingTest;

import java.util.Stack;

public class CreinPickUp {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                    if (board[j][move - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else
                        stack.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] hi = new int[5][5];
        int[] hi2 = new int[5];
        for (int i : hi2) {
            hi2[i] = 1;
        }
        int count = 0;
        for (int i = 0 ; i < hi.length ; i ++) {
            for (int j = 0 ; j < hi[0].length ; j ++ ) {
                hi[i][j] = count++;
            }
        }

        CreinPickUp creinPickUp = new CreinPickUp();
        creinPickUp.solution(hi,hi2);
    }
}
