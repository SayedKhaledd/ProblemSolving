package org.example.leetcode.general;

import java.util.Map;
import java.util.TreeMap;

public class SingleNumber2 {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,3,3,1,1,3,4, 2, 2, 2}));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int x = 0;
        for (Map.Entry<Integer, Integer> c : map.entrySet()) {
            if (c.getValue() == 1) {
                x = c.getKey();
            }
        }
        return x;
    }
}
