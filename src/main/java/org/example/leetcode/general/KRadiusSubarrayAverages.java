package org.example.leetcode.general;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3)));
//        System.out.println(Arrays.toString(getAverages(new int[]{18334, 25764, 19780, 92480, 69842, 73255, 89893}, 0)));

        int[] arr = new int[100000];
        Arrays.fill(arr, 100000);
        System.out.println(Arrays.toString(getAverages(arr, 40000)));
    }

    public static int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length];
        if (k == 0)
            return nums;
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        for (int i = 0; i < k && i < nums.length; i++) {
            result[i] = -1;
        }
        for (int i = nums.length - 1; i > nums.length - 1 - k && i >= 0; i--) {
            result[i] = -1;
        }
        for (int i = k; i <= nums.length - 1 - k; i++) {
            long sum1 = i - 1 - k >= 0 ? prefixSum[i - 1] - prefixSum[i - 1 - k] : prefixSum[i - 1];
            long sum2 = prefixSum[i + k] - prefixSum[i];
            result[i] = (int) ((sum1 + sum2 + nums[i]) / (1 + k * 2));
        }
        return result;
    }
}
