package org.example.leetcode.general;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
//        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));
//        System.out.println(search(new int[]{5, 1, 2, 3, 4}, 1));
//        System.out.println(search(new int[]{5, 1, 2, 3, 4}, 8));
        System.out.println(search(new int[]{3,5,1}, 1));

    }

    public static int search(int[] nums, int target) {
        int pivotedIndex;
        int min;
        for (int low = 0, mid = nums.length / 2, high = nums.length - 1; true; ) {
            if(target==nums[low])
                return low;
            if(target==nums[mid])
                return mid;
            if(target==nums[high])
                return high;

            min = Math.min(nums[low], Math.min(nums[mid], nums[high]));
            if (min == nums[low]) {
                pivotedIndex = low;
                break;
            } else if (min == nums[mid]) {
                if (mid + 1 < nums.length && nums[mid + 1] < nums[mid])
                    mid++;
                else if (mid - 1 >= 0 && nums[mid - 1] < nums[mid])
                    mid--;
                else {
                    pivotedIndex = mid;
                    break;
                }
            } else {
                if (high - 1 >=0 && nums[high - 1] > nums[high]) {
                    pivotedIndex = high;
                    break;
                } else
                    high--;
            }
        }
        System.out.println(pivotedIndex);

        int x;
        if (pivotedIndex == 0) {
            x = Arrays.binarySearch(nums, 0, nums.length, target);
        } else {
            if (target == nums[pivotedIndex])
                return pivotedIndex;
            if (target == nums[pivotedIndex - 1])
                return pivotedIndex - 1;
            if (target > nums[0]) {
                x = Arrays.binarySearch(nums, 0, pivotedIndex, target);
            } else {
                x = Arrays.binarySearch(nums, pivotedIndex, nums.length, target);
            }

        }
        return x < 0 ? -1 : x;
    }
}
