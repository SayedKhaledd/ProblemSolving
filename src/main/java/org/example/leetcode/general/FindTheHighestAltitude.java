package org.example.leetcode.general;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            if (current > max)
                max = current;
        }

        return max;
    }
}
