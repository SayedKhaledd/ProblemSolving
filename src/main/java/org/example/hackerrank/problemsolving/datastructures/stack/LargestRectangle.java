package org.example.hackerrank.problemsolving.datastructures.stack;

import java.util.List;

public class LargestRectangle {

    public static long largestRectangle(List<Integer> h) {
        // Write your code here
        int max = -1, val;
        for (int i = 0, j; i < h.size(); i++) {
            j = i - 1;
            val = h.get(i);
            //left
            while (j >= 0) {
                if (h.get(j) >= h.get(i))
                    val += h.get(i);
                else break;
                j--;
            }

            //right
            j = i + 1;
            while (j < h.size()) {
                if (h.get(j) >= h.get(i))
                    val += h.get(i);
                else break;
                j++;
            }

            if (val > max)
                max = val;
        }
        return max;

    }
}
