package org.example.leetcode.general;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix, 31));
        System.out.println(searchMatrix(new int[][]{{1}}, 1));

        System.out.println(searchMatrix(new int[][]{{1}, {3}}, 2));


    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = n - 1, mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (target == matrix[low][m - 1] || target == matrix[high][m - 1] || target == matrix[mid][m - 1])
                return true;
            if (target == matrix[low][0] || target == matrix[high][0] || target == matrix[mid][0])
                return true;

            if (target < matrix[high][m - 1] && target > matrix[high][0]) {
                index = high;
                break;
            }
            if (target < matrix[low][m - 1] && target > matrix[low][0]) {
                index = low;
                break;

            }
            if (target < matrix[mid][m - 1] && target > matrix[mid][0]) {
                index = mid;
                break;
            }
            if (target < matrix[mid][m - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (high + low) / 2;

        }

        if (n == 1)
            index = 0;
        if (index == -1)
            return false;
        low = 0;
        high = m - 1;
        mid = (low + high) / 2;
        while (low <= high) {
            if (target == matrix[index][low] || target == matrix[index][high] || target == matrix[index][mid])
                return true;
            if (target < matrix[index][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (high + low) / 2;
        }
        return false;
    }
}
