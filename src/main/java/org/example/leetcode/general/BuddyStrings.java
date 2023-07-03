package org.example.leetcode.general;

import java.util.Map;
import java.util.TreeMap;

public class BuddyStrings {
    public static void main(String[] args) {
        System.out.println(buddyStrings("acccccb", "bccccca"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < goal.length(); i++)
            map.put(goal.charAt(i), map.getOrDefault(goal.charAt(i), 0) + 1);
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            int x = map.getOrDefault(s.charAt(i), 0);
            if (x == 0) {
                return false;
            }
            if (x > 1) found = true;
        }
        int count = 0;
        char sF = 's', gF = 'g';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
                if (count == 1) {
                    sF = s.charAt(i);
                    gF = goal.charAt(i);
                }
                if (count == 2) {
                    if (goal.charAt(i) != sF || s.charAt(i) != gF) {
                        System.out.println("here");
                        return false;
                    }
                }
            }
            if (count > 2) return false;
        }
        System.out.println(found);

        return count == 2 || (count == 0 && found);
    }

}
