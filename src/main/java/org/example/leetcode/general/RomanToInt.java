package org.example.leetcode.general;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    //Runtime 7 ms Beats 38.33% Memory 43.8 MB Beats 46.2%
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if (s.length() == 1)
            return map.get(s.charAt(0));
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i + 1)) > map.get(s.charAt(i))) {
                sum += (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
                i++;
            } else
                sum += map.get(s.charAt(i));

        }
        return sum;


    }

    // Runtime 4 ms Beats 94.67% Memory 43.6 MB Beats 54.93%

    public static int romanToInt2(String s) {
        if (s.length() == 1)
            return val(s.charAt(0));
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && val(s.charAt(i + 1)) > val(s.charAt(i))) {
                sum += (val(s.charAt(i + 1)) - val(s.charAt(i)));
                i++;
            } else
                sum += val(s.charAt(i));

        }
        return sum;

    }

    public static int val(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
