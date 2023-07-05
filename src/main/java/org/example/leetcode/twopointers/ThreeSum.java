package org.example.leetcode.twopointers;

import java.util.*;

//https://leetcode.com/problems/3sum/description/
public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString() + System.currentTimeMillis());
        System.out.println(UUID.randomUUID().toString());
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = scan.nextInt();
//        int[] arr = {-1, 0, 1, 2, -1, -4};
//        int[] arr = {0,1,1};
//        int[] arr = {0, 0, 0};
        int[] arr = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
//        int[] arr = {3, 0, -2, -1, 1, 2};

        List<List<Integer>> arrayLists = threeSum(arr);
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(arrayLists.get(i).toString());
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int x = 0, y = 0, z = 0;
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return new ArrayList<>(result);

        }
        int positive_sum = 0, negative_sum = 0;
        for (int num : nums) {
            if (num < 0)
                negative_sum += num;
            else
                positive_sum += num;
        }
        if (positive_sum == 0 && negative_sum == 0) {
            ArrayList<Integer> approvedAnswer = new ArrayList<>();
            approvedAnswer.add(0);
            approvedAnswer.add(0);
            approvedAnswer.add(0);
            result.add(approvedAnswer);

            return new ArrayList<>(result);
        }
        for (int i = 0, j = nums.length - 1; nums[i] <= 0 && i < j; ) {
            if (nums[i] * -1 > positive_sum) {
                i++;
                continue;
            }

            if (nums[j] > 0 && nums[j] > negative_sum * -1) {
                j--;
                continue;
            }
            if (j - i == 1) {
                i++;
                j = nums.length - 1;
                continue;
            }


            x = nums[i];
            y = nums[j];

            z = Arrays.binarySearch(nums, i + 1, j, -(x + y));
            if (z > -1) {
                z = nums[z];
                ArrayList<Integer> approvedAnswer = new ArrayList<>();
                approvedAnswer.add(x);
                approvedAnswer.add(y);
                approvedAnswer.add(z);
                result.add(approvedAnswer);

            }
            j--;


        }


        return new ArrayList<>(result);
    }


}
