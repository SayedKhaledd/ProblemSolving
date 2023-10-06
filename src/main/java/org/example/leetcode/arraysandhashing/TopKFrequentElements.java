package org.example.leetcode.arraysandhashing;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        final int MAX = 10001;
        int[] freq = new int[MAX * 2];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x >= 0)
                freq[x]++;
            else
                freq[x * -1 + MAX]++;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int max = 0, maxIndex = -1;
            for (int j = 0; j < freq.length; j++) {
                if (freq[j] > max) {
                    max = freq[j];
                    maxIndex = j;
                }
            }
            freq[maxIndex] = 0;
            if (maxIndex > MAX) {
                result[i] = (maxIndex - MAX) / -1;
            } else
                result[i] = maxIndex;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }


        return result;
    }


}
