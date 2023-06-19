package org.example.leetcode.arraysandhashing;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] freq = new char[26];
        char[] freq2 = new char[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq2[t.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq2[i])
                return false;
        }
        return true;


    }
}
