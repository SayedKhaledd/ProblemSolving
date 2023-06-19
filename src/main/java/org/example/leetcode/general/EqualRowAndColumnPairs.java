package org.example.leetcode.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EqualRowAndColumnPairs {
    //Solution 1
    /*
    Runtime  37 ms  Beats 71.58%
    Memory 52.9 MB Beats 11.29%
     */
    public int equalPairs(int[][] grid) {
        int[][] columnGrid = new int[grid.length][grid.length];


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                columnGrid[i][j] = grid[j][i];
            }
        }

        int counter = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < grid.length; j++) {
                if (compareArrays(ints, columnGrid[j]))
                    counter++;
            }
        }
        return counter;
    }

    public boolean compareArrays(int[] row, int[] column) {

        for (int i = 0; i < row.length; i++)
            if (row[i] != column[i])
                return false;
        return true;
    }
    /*
      Runtime  48 ms  Beats 54.17%
      Memory 46.4 MB Beats 93.88%
 */
    //solution 2
    public int equalPairs2(int[][] grid) {

        Map<String, Integer> map = new HashMap<>();

        for (int[] row : grid) {
            String key = Arrays.toString(row);
            map.put(key, 1 + map.getOrDefault(key, 0));
        }
        int count = 0;
        for (int c = 0; c < grid.length; c++) {
            int[] col = new int[grid.length];
            for (int r = 0; r < grid.length; r++) {
                col[r] = grid[r][c];
            }
            count += map.getOrDefault(Arrays.toString(col), 0);
        }
        return count;
    }



}
