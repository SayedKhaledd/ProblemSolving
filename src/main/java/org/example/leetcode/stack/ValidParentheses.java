package org.example.leetcode.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(()){}"));
    }

    public static boolean isValid(String s) {
        final char OPEN_ROUND_BRACKET = '(';
        final char CLOSED_ROUND_BRACKET = ')';
        final char OPEN_CURLY_BRACKET = '{';
        final char CLOSED_CURLY_BRACKET = '}';
        final char OPEN_SQUARE_BRACKET = '[';
        final char CLOSED_SQUARE_BRACKET = ']';

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(i);
            if (stack.empty())
                stack.push(s.charAt(i));
            else if (s.charAt(i) == CLOSED_CURLY_BRACKET || s.charAt(i) == CLOSED_ROUND_BRACKET || s.charAt(i) == CLOSED_SQUARE_BRACKET) {
                switch (stack.peek()) {
                    case OPEN_ROUND_BRACKET -> {
                        if (s.charAt(i) == CLOSED_ROUND_BRACKET)
                            stack.pop();
                        else
                            return false;
                    }
                    case OPEN_CURLY_BRACKET -> {
                        if (s.charAt(i) == CLOSED_CURLY_BRACKET)
                            stack.pop();
                        else
                            return false;
                    }
                    case OPEN_SQUARE_BRACKET -> {
                        if (s.charAt(i) == CLOSED_SQUARE_BRACKET)
                            stack.pop();
                        else
                            return false;
                    }
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
