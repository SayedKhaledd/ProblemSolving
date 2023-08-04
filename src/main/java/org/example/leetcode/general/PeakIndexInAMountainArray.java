package org.example.leetcode.general;

public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i])
                return i;
        }

        return index;
    }

    public int peakIndexInMountainArray2(int[] arr) {

        int l = 0, r = arr.length - 1, mid = (l + r) / 2;

        while (l < r) {

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                l = mid;
            } else {
                r = mid;
            }
            mid = (l + r) / 2;

        }
        return -1;

    }
}
