package org.example.leetcode.general;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char val = t.charAt(i);
            if (charsMap.get(key) == null) {
                Optional<Map.Entry<Character, Character>> optionalC = charsMap.entrySet().stream().filter(e -> e.getValue() == val).findFirst();
                if (optionalC.isPresent() && key != optionalC.get().getKey())
                    return false;
                charsMap.put(s.charAt(i), t.charAt(i));
            } else {
                if (charsMap.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (mapS[s.charAt(i)] != mapT[t.charAt(i)])
                return false;
            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;
        }
        return true;
    }

}
