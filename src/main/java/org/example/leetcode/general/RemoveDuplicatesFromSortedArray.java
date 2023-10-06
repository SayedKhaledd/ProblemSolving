package org.example.leetcode.general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr2 = {1, 1, 2};
        int k = removeDuplicates(arr2);
        for (int i = 0; i < k; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (integers.contains(nums[i]))
                counter++;
            integers.add(nums[i]);

        }
        List<Integer> arrayList = new ArrayList<>(integers);
        arrayList.sort(Integer::compareTo);

        for (int i = 0; i < nums.length - counter; i++) {
            nums[i] = arrayList.get(i);
        }

        return nums.length - counter;
    }

    //solution 2
    public static int removeDuplicates2(int[] nums) {

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i + 1;
    }

}
