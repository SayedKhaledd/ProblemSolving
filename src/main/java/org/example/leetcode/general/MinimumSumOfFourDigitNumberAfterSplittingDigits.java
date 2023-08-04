package org.example.leetcode.general;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        System.out.println(minimumSum(1000));
    }

    public static int minimumSum(int num) {
        int x = 0, y = 0;
        int[] arr = new int[4];
        arr[0] = num / 1000;
        arr[1] = (num / 100) % 10;
        arr[2] = (num / 10) % 10;
        arr[3] = num % 10;
        Arrays.sort(arr);

        x = arr[0] * 10 + arr[2];
        y = arr[1] * 10 + arr[3];


        return x + y;
    }
}
