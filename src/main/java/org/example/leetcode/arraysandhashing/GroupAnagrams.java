package org.example.leetcode.arraysandhashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> arrs = new ArrayList<>();
        ArrayList<String> in = new ArrayList<>();
        Collections.addAll(in, strs);

        for (int i = 0; i < in.size(); i++) {
            arrs.add(new ArrayList<>());
            arrs.get(i).add(in.get(i));

            for (int j = i + 1; j < in.size(); j++) {
                if (isAnagram(in.get(i), in.get(j))) {
                    arrs.get(i).add(in.get(j));
                    in.remove(in.lastIndexOf(in.get(j)));
                    j--;
                }

            }

        }
        return arrs;
    }

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
