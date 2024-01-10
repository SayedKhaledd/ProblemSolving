package org.example.leetcode.general;

public class LargestSubstringBetweenTwoEqualCharacters {

    public static void main(String[] args) {

        System.out.println(maxLengthBetweenEqualCharacters("cabbao"));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {

        int[] arr = new int[26];
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 97] == 0) {
                arr[s.charAt(i) - 97] = i + 1;
            } else {
                max = Math.max(max, i - arr[s.charAt(i) - 97]);
            }
        }
        return max;
    }
}
