package com.company.codingTest;

public class Sosu {

    public int solution(int[] nums) {
        int sosuCount = 0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) sosuCount++;
                }
            }
        }


        return sosuCount;
    }
    private boolean isPrime(int s) {
        int count = 0;
        for (int i = 2 ; i <= s ; i++ ) {
            if (s % i == 0)
                count ++;
        }
        return count == 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,6,4};
        Sosu sosu = new Sosu();
        int solution = sosu.solution(arr);
        System.out.println(solution);
    }
}
