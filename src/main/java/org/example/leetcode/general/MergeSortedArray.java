package org.example.leetcode.general;

public class MergeSortedArray {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[] arr = new int[n + m];
        arr = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[m];
        arr2 = new int[]{2, 5, 6};
        merge(arr, m, arr2, n);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                int k = m;
                while (k != i) {
                    nums1[k] = nums1[k - 1];
                    k--;
                }
                nums1[i] = nums2[j];
                j++;
                m++;
            } else {
                i++;
            }
        }


        while (j < n && i < n + m) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}
