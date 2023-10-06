package org.example.leetcode.general;


public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));

    }

    //TODO: FIND BETTER SOLUTION
    public static boolean rotateString(String s, String goal) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (stringBuilder.toString().equals(goal))
                return true;
            char c = stringBuilder.charAt(0);
            stringBuilder.delete(0, 1);
            stringBuilder.append(c);
        }
        return false;

    }

}
