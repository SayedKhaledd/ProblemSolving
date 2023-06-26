package org.example.leetcode.slidingwindow;

import java.util.ArrayList;

//not yet
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.set(0,1);
    }
    public int characterReplacement(String s, int k) {
        int[] fre = new int[26];
        for (int i = 0; i < s.length(); i++) {
            fre[s.charAt(i) - 'A']++;
        }
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ) {
            StringBuilder s2 = new StringBuilder();
            if (j == 0)
                s2.append(s.charAt(i));
            else {
                if (s2.charAt(j - 1) == s2.charAt(j)) {
                    s2.append(s.charAt(j));
                    j++;
                } else {

                    if (k != 0) {
//                     s2.append()
                    } else {
                        i++;
                        j = i;
                        if (s2.length() > max)
                            max = s2.length();
                    }

                }
            }
        }
        return max;
    }

}
