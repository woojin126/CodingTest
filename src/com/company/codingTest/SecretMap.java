package com.company.codingTest;

import java.util.Arrays;
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int j = 0; j < n; j++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = n - 1; i >= 0 ; i--) {
                int arr1Value = arr1[j] % 2;
                int arr2Value = arr2[j] % 2;

                convertString(stringBuilder, arr1Value, arr2Value);

                arr1[j] = arr1[j] / 2;
                arr2[j] = arr2[j] / 2;
            }
            result[j] = stringBuilder.reverse().toString();
        }


        return result;
    }

    private void convertString(StringBuilder stringBuilder, int arr1Value, int arr2Value) {
        if ((arr1Value == 0 && arr2Value == 0)) {
            stringBuilder.append(" ");
        } else {
            stringBuilder.append("#");
        }
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        String[] solution = secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        System.out.println(Arrays.toString(solution));
    }
}
