package leetcode.slidingwindow;

import java.util.Arrays;
/**
 * not yet
 */

public class CountSubarraysWithFixedBounds {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Arrays.fill(arr, 1);
        System.out.println(countSubarrays(new int[]{1,3,5,2,7,5}, 1, 5));
    }

    public static long countSubarrays(int[] arr, int minK, int maxK) {
        boolean myChecker=true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=arr[i-1]){
                myChecker=false;
                break;
            }
        }
        if (myChecker) {
            System.out.println("here");
            return ((long) arr.length * (arr.length + 1)) / 2;
        }


        long counter = 0;
        boolean checkMin = false, checkMax = false;

        for (int i = 0, j = 0; i < arr.length && j < arr.length; j++) {
            if (arr[i] >= minK && arr[i] <= maxK) {
                if (arr[j] == minK)
                    checkMin = true;
                if (arr[j] == maxK)
                    checkMax = true;
                if (checkMin && checkMax && arr[j] >= minK && arr[j] <= maxK) {
                    counter++;
                }
                if (!(arr[j] >= minK && arr[j] <= maxK)) {
                    i++;
                    j = i - 1;
                    checkMin = false;
                    checkMax = false;

                }
            } else {
                i++;
                j = i - 1;
                checkMin = false;
                checkMax = false;
            }
            if (j == arr.length - 1 && i < j) {
                i++;
                j = i - 1;
                checkMin = false;
                checkMax = false;
            }
        }

        return counter;
    }
}
