package org.example.codesignal.intro;

public class CheckPalindrome {
    boolean solution(String inputString) {
        StringBuilder s = new StringBuilder(inputString);
        return s.reverse().toString().equals(inputString);
    }
}
