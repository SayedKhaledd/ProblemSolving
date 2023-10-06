package org.example.leetcode.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aau"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0, max = 0;
        if (s.length() == 1)
            return 1;

        for (int i = 0, j = 0; i < s.length(); ) {
            if (map.get(s.charAt(j)) == null) {
                count++;
                map.put(s.charAt(j), 1);
                j++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
                map.clear();
                i++;
                j = i;

            }
            if (j > s.length() - 1) {
                i++;
                j = i;

            }
        }
        if (count > max)
            max = count;
        return max;
    }
}
