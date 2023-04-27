package leetcode.arraysandhashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
//        System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(longestConsecutive(new int[]{9, 1, -3, 2, 4, 8, 3, -1, 6, -2, -4, 7}));

    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int max = 1, curr = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            if (nums[i] - 1 == nums[i - 1])
                curr++;
            else {
                if (curr > max) {
                    max = curr;
                }
                curr = 1;


            }
            System.out.println("curr is " + curr + " max is " + max);
        }
        if (curr > max) {
            max = curr;
        }
        return max;
    }
}
