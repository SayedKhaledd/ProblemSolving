package org.example.leetcode.general;

public class RangeSumQueryTwoDImmutable {
    class NumMatrix {
        int[][] prefixSum;
        int[][] myMatrix;

        //TODO: FIND BETTER SOLUTION
        public NumMatrix(int[][] matrix) {
            myMatrix = matrix;
            prefixSum = new int[matrix.length][matrix[0].length];

            int n = matrix.length, m = matrix[0].length;

            //rows
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (j == 0)
                        prefixSum[i][j] = matrix[i][j];
                    else {
                        prefixSum[i][j] = matrix[i][j] + prefixSum[i][j - 1];
                    }
                }
            }

        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int i = row1; i <= row2; i++) {
                sum += (prefixSum[i][col2] - (col1 > 0 ? prefixSum[i][col1 - 1] : 0));
            }
            return sum;
        }
    }
}
